CREATE TABLE categories
(
    id         UUID        NOT NULL,
    name       VARCHAR(50) NOT NULL,
    type       SMALLINT,
    user_id_id UUID,
    CONSTRAINT pk_categories PRIMARY KEY (id)
);

CREATE TABLE goals
(
    id             UUID             NOT NULL,
    name           VARCHAR(255)     NOT NULL,
    target_amount  DOUBLE PRECISION NOT NULL,
    current_amount DOUBLE PRECISION,
    due_date       TIMESTAMP WITHOUT TIME ZONE NOT NULL,
    created_at     TIMESTAMP WITHOUT TIME ZONE,
    user_id        UUID,
    CONSTRAINT pk_goals PRIMARY KEY (id)
);

CREATE TABLE transactions
(
    id               UUID             NOT NULL,
    amount           DOUBLE PRECISION NOT NULL,
    description      VARCHAR(255),
    transaction_date TIMESTAMP WITHOUT TIME ZONE NOT NULL,
    created_at       TIMESTAMP WITHOUT TIME ZONE,
    user_id_id       UUID,
    category_id_id   UUID,
    CONSTRAINT pk_transactions PRIMARY KEY (id)
);

CREATE TABLE users
(
    id         UUID         NOT NULL,
    username   VARCHAR(100) NOT NULL,
    email      VARCHAR(100) NOT NULL,
    password   VARCHAR(255) NOT NULL,
    created_at TIMESTAMP WITHOUT TIME ZONE,
    CONSTRAINT pk_users PRIMARY KEY (id)
);

ALTER TABLE categories
    ADD CONSTRAINT uc_categories_name UNIQUE (name);

ALTER TABLE users
    ADD CONSTRAINT uc_users_email UNIQUE (email);

ALTER TABLE categories
    ADD CONSTRAINT FK_CATEGORIES_ON_USERID FOREIGN KEY (user_id_id) REFERENCES users (id);

ALTER TABLE goals
    ADD CONSTRAINT FK_GOALS_ON_USER FOREIGN KEY (user_id) REFERENCES users (id);

ALTER TABLE transactions
    ADD CONSTRAINT FK_TRANSACTIONS_ON_CATEGORYID FOREIGN KEY (category_id_id) REFERENCES categories (id);

ALTER TABLE transactions
    ADD CONSTRAINT FK_TRANSACTIONS_ON_USERID FOREIGN KEY (user_id_id) REFERENCES users (id);