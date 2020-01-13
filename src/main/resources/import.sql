INSERT INTO usuarios (username, password, enabled, nombre, apellido, email) VALUES ('miguel', '$2a$10$j2idwqfNasMa6Uw65ahxzO8.YgKA2DkZKz2odvhfmbcPOvIQ4AqzW', 1, 'Miguel','Chinchay', 'miguel@tuna.pe');
INSERT INTO usuarios (username, password, enabled, nombre, apellido, email) VALUES ('admin', '$2a$10$jIfPlHBgdmD99JAiWTYiLOzjjooXuVN2edwhVMoe0kpJ3aFm9cS7G', 1, 'Admin','Xinxay', 'admin@tuna.pe');

INSERT INTO roles (nombre) VALUES ('ROLE_USER');
INSERT INTO roles (nombre) VALUES ('ROLE_ADMIN');

INSERT INTO usuarios_roles (usuario_id, rol_id) VALUES (1, 1);
INSERT INTO usuarios_roles (usuario_id, rol_id) VALUES (2, 1);
INSERT INTO usuarios_roles (usuario_id, rol_id) VALUES (2, 2);