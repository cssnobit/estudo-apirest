insert into cozinha (id, nome) values (1, 'Tailandesa');
insert into cozinha (id, nome) values (2, 'Indiana');

insert into forma_pagamento (descricao) values ('Pagamento feito no PIX');
insert into forma_pagamento (descricao) values ('Pagamento feito no dinheiro');
insert into forma_pagamento (descricao) values ('Pagamento feito no cartao de credito');

insert into restaurante (nome, taxa_frete, cozinha_id, forma_pagamento_id) values ('Thaitai', 10.0, 1, 1);
insert into restaurante (nome, taxa_frete, cozinha_id, forma_pagamento_id) values ('Tandoor', 12.0, 2, 3);
insert into restaurante (nome, taxa_frete, cozinha_id, forma_pagamento_id) values ('Reet Namaste', 11.50, 2, 2);


insert into permissao (nome, descricao) values ('Ver prato', 'Permite consultar a descricao do prato');
insert into permissao (nome, descricao) values ('Ver cozinha', 'Permite consultar o tipo de cozinha do restaurante');

insert into estado (nome) values ('Sao Paulo');
insert into estado (nome) values ('Minas Gerais');

insert into cidade (nome, estado_id) values ('Brumadinho', 2);
insert into cidade (nome, estado_id) values ('Santos', 1);
insert into cidade (nome, estado_id) values ('Sao Vicente', 1);