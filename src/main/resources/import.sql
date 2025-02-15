INSERT INTO tb_categoria (descricao) VALUES ('Curso');
INSERT INTO tb_categoria (descricao) VALUES ('Oficina');

INSERT INTO tb_atividade (categoria_id, nome, descricao, preco) VALUES (1, 'Curso de HTML', 'Aprenda HTML de forma prática', 80.00);
INSERT INTO tb_atividade (categoria_id, nome, descricao, preco) VALUES (2, 'Oficina de Github', 'Controle versões de seus projetos', 50.00);

INSERT INTO tb_bloco (atividade_id, inicio, fim) VALUES (1, TIMESTAMP WITH TIME ZONE '2017-09-25T08:00:00Z', TIMESTAMP WITH TIME ZONE '2017-09-25T11:00:00Z');
INSERT INTO tb_bloco (atividade_id, inicio, fim) VALUES (2, TIMESTAMP WITH TIME ZONE '2017-09-25T14:00:00Z', TIMESTAMP WITH TIME ZONE '2017-09-25T18:00:00Z');
INSERT INTO tb_bloco (atividade_id, inicio, fim) VALUES (2, TIMESTAMP WITH TIME ZONE '2017-09-26T08:00:00Z', TIMESTAMP WITH TIME ZONE '2017-09-26T11:00:00Z');

INSERT INTO tb_participante (nome, email) VALUES ('José Silva', 'jose@gmail.com');
INSERT INTO tb_participante (nome, email) VALUES ('Tiago Faria', 'tiago@gmail.com');
INSERT INTO tb_participante (nome, email) VALUES ('Maria do Rosário', 'maria@gmail.com');
INSERT INTO tb_participante (nome, email) VALUES ('Teresa Silva', 'teresa@gmail.com');

INSERT INTO tb_participante_atividade (participante_id, atividade_id, preco) VALUES (1, 1, 80.00);
INSERT INTO tb_participante_atividade (participante_id, atividade_id, preco) VALUES (1, 2, 50.00);
INSERT INTO tb_participante_atividade (participante_id, atividade_id, preco) VALUES (2, 1, 80.00);
INSERT INTO tb_participante_atividade (participante_id, atividade_id, preco) VALUES (3, 1, 80.00);
INSERT INTO tb_participante_atividade (participante_id, atividade_id, preco) VALUES (3, 2, 50.00);
INSERT INTO tb_participante_atividade (participante_id, atividade_id, preco) VALUES (4, 2, 50.00);
