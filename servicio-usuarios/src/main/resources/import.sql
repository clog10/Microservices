INSERT INTO usuarios (username, password, enabled, nombre, apellido, email) VALUES ('clog10', '123456', true, 'Carlos', 'Loaeza', 'carlos@gmail.com')
INSERT INTO usuarios (username, password, enabled, nombre, apellido, email) VALUES ('admin', '123456', true, 'Valeria', 'Zarate', 'vayeya@gmail.com')

INSERT INTO roles (nombre) VALUES ('ROLE_USER')
INSERT INTO roles (nombre) VALUES ('ROLE_ADMIN')

INSERT INTO usuarios_roles (usuario_id, rol_id) VALUES(1,1)
INSERT INTO usuarios_roles (usuario_id, rol_id) VALUES(2,2)
INSERT INTO usuarios_roles (usuario_id, rol_id) VALUES(2,1)

