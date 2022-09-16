--liquibase formatted sql
--changeset b2m:Init-01
INSERT INTO utilisateur(
    id, activated, email, first_name, last_name, username, pwd_hash, code_pin)
VALUES (1, true, 'admin@admin.com', 'Administrateur', 'Administrateur', 'admin', '$2a$10$mxEbGpgXxIyClLll/xQWX.5tOEq.BlOKMAAhRUqFUL5uNFjBF992u', 0);