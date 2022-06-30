#language:pt

@tag
Funcionalidade: Formulario de funcionario
Eu como colaborador Quero adicionar um novo funcionario Para o banco de dados

@tag1
Cenario: Enviar Formulario com sucesso
Dado que eu acesse o formulario
Quando preencho as informações
E envio o formulario
Entao o sistema retorna na tela os resultado do formulario
