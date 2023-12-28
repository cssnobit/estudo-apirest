insert into cozinha (id, nome) values (1, 'Tailandesa');
insert into cozinha (id, nome) values (2, 'Indiana');
insert into cozinha (id, nome) values (3, 'Brasileira');

insert into forma_pagamento (descricao) values ('PIX');
insert into forma_pagamento (descricao) values ('Dinheiro');
insert into forma_pagamento (descricao) values ('Cartão de crédito');
insert into forma_pagamento (descricao) values ('Cartão de débito');

insert into restaurante (nome, taxa_frete, cozinha_id) values ('Thaitai Restaurante', 10.0, 1);
insert into restaurante (nome, taxa_frete, cozinha_id) values ('Tandoor Indian Food', 12.0, 2);
insert into restaurante (nome, taxa_frete, cozinha_id) values ('Reet Namaste Brasil', 11.50, 2);


insert into permissao (nome, descricao) values ('VER_PRATO', 'Permite consultar a descricao do prato');
insert into permissao (nome, descricao) values ('VER_COZINHA', 'Permite consultar o tipo de cozinha do restaurante');
insert into permissao (nome, descricao) values ('ADICIONAR_COZINHA', 'Permite adicionar um tipo de cozinha do restaurante');

insert into estado (nome) values ('Sao Paulo');
insert into estado (nome) values ('Minas Gerais');
insert into estado (nome) values ('Maranhao');

insert into cidade (nome, estado_id) values ('Brumadinho', 2);
insert into cidade (nome, estado_id) values ('Santos', 1);
insert into cidade (nome, estado_id) values ('Sao Vicente', 1);
insert into cidade (nome, estado_id) values ('Barreirinhas', 3);

insert into restaurante_forma_pagamento (restaurante_id, forma_pagamento_id) values (1, 1), (1, 3), (1, 4), (2, 1), (2, 2), (3, 2), (3, 3), (3, 4);