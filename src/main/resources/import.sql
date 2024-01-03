insert into cozinha (id, nome) values (1, 'Tailandesa');
insert into cozinha (id, nome) values (2, 'Indiana');
insert into cozinha (id, nome) values (3, 'Brasileira');
insert into cozinha (id, nome) values (4, 'Mexicana');

insert into forma_pagamento (descricao) values ('PIX');
insert into forma_pagamento (descricao) values ('Dinheiro');
insert into forma_pagamento (descricao) values ('Cartão de crédito');
insert into forma_pagamento (descricao) values ('Cartão de débito');

insert into estado (nome) values ('São Paulo');
insert into estado (nome) values ('Minas Gerais');
insert into estado (nome) values ('Maranhão');

insert into cidade (nome, estado_id) values ('Brumadinho', 2);
insert into cidade (nome, estado_id) values ('Santos', 1);
insert into cidade (nome, estado_id) values ('São Vicente', 1);
insert into cidade (nome, estado_id) values ('Barreirinhas', 3);
insert into cidade (nome, estado_id) values ('São Paulo', 1);

insert into restaurante (nome, taxa_frete, cozinha_id, data_cadastro, data_atualizacao, endereco_cep, endereco_logradouro, endereco_numero, endereco_bairro, endereco_cidade_id) values ('Thaitai Restaurante', 10.0, 1, utc_timestamp, utc_timestamp, '44445-980', 'Rua Antonio de Vicente', '476', 'Vila Persa', 5);
insert into restaurante (nome, taxa_frete, cozinha_id, data_cadastro, data_atualizacao, endereco_cep, endereco_logradouro, endereco_numero, endereco_bairro, endereco_cidade_id) values ('Tandoor Indian Food', 12.0, 2, utc_timestamp, utc_timestamp, '10520-320', 'Rua Joaquim Medeiros', '2', 'Canto das Cobras', 1);
insert into restaurante (nome, taxa_frete, cozinha_id, data_cadastro, data_atualizacao, endereco_cep, endereco_logradouro, endereco_numero, endereco_bairro, endereco_cidade_id) values ('Reet Namaste Brasil', 11.50, 2, utc_timestamp, utc_timestamp, '15555-210', 'Rua Das Garças', '37', 'Jaguamirim', 2);
insert into restaurante (nome, taxa_frete, cozinha_id, data_cadastro, data_atualizacao, endereco_cep, endereco_logradouro, endereco_numero, endereco_bairro, endereco_cidade_id, endereco_complemento) values ('Magro Lanches', 6.00, 3, utc_timestamp, utc_timestamp, '47965-000', 'Rua José Tavares', '22', 'Itapacema', 3, 'Trailer Branco');
insert into restaurante (nome, taxa_frete, cozinha_id, data_cadastro, data_atualizacao, endereco_cep, endereco_logradouro, endereco_numero, endereco_bairro, endereco_cidade_id) values ('Bom Prato', 0, 3, utc_timestamp, utc_timestamp, '12110-215', 'Avenida Bonaparte', '5', 'Joares', 1);
insert into restaurante (nome, taxa_frete, cozinha_id, data_cadastro, data_atualizacao, endereco_cep, endereco_logradouro, endereco_numero, endereco_bairro, endereco_cidade_id, endereco_complemento) values ('Arriba Del Campo', 8.50, 4, utc_timestamp, utc_timestamp, '32533-655', 'Rua João Barros', '12', 'Alfaiate', 2, 'Galeria número 57');

insert into produto (nome, descricao, preco, ativo, restaurante_id) values ('Camarão com Arroz', 'Um prato de arroz acompanhado com camarao ao molho e salada vem junto', 38.0, true, 1);
insert into produto (nome, descricao, preco, ativo, restaurante_id) values ('Som Tum', 'Um prato picante acompanhado por feijão verde, papaia, tomates cherry, alho e malaguetas', 12.80, false, 1);
insert into produto (nome, descricao, preco, ativo, restaurante_id) values ('Masala Beans', 'Prato feito com feijão e uma variedade de ervas, temperos, molhos e pimenta. Contém também legumes', 38.0, false, 2);
insert into produto (nome, descricao, preco, ativo, restaurante_id) values ('Samosa', 'Aperitivo frito feito a base de uma massa semelhante ao pastel recheado com vegetais', 22.50, true, 3);

insert into permissao (nome, descricao) values ('VER_PRATO', 'Permite consultar a descrição do prato');
insert into permissao (nome, descricao) values ('VER_COZINHA', 'Permite consultar o tipo de cozinha do restaurante');
insert into permissao (nome, descricao) values ('ADICIONAR_COZINHA', 'Permite adicionar um tipo de cozinha do restaurante');


insert into restaurante_forma_pagamento (restaurante_id, forma_pagamento_id) values (1, 1), (1, 3), (1, 4), (2, 1), (2, 2), (3, 2), (3, 3), (3, 4), (4, 1), (4, 2), (4, 3), (4, 4), (5, 2), (6, 2), (6, 3), (6, 4);