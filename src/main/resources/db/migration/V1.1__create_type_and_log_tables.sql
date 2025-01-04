CREATE TABLE IF NOT EXISTS log_type(
    id BIGINT NOT NULL,
    name VARCHAR(64) NOT NULL,
    unit VARCHAR(64) NOT NULL,
    CONSTRAINT pk_log_type PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS log(
    id BIGINT NOT NULL,
    log_date DATE NOT NULL,
    amount NUMERIC(10, 7),
    type_id BIGINT NOT NULL,
    description VARCHAR(255),
    CONSTRAINT pk_log PRIMARY KEY (id),
    CONSTRAINT fk_log_log_type FOREIGN KEY (type_id) REFERENCES log(id)
);

CREATE INDEX IF NOT EXISTS idx_log_type ON log(type_id);

