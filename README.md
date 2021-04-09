# Implementacao1-Tradutor

Trabalho de implementação de tradutor para expressões pós fixadas

Alunos: Yuri Chiesa 201811113030010 e Edmar Alves 201811113030030.

A linguagem que foi utilizada é Java.

Bom, a tecnica que foi utilizada foi a mais rudimentrar possível, como o tempo tava apertando e queríamos entregar tudo até o dia 10, fomos pedindo ajuda de quem podíamos, analisando diversos códigos e tentando montar tanto esse tradutor quanto os outros trabalhos. O arquivo leitorArquivo contém o caminho para ser lido, e o separador divide os arrays onde a primeira entrada é um operador e em sequência os símbolos. No arquivo Expressão é onde ela vai recever o arrat do separador e instânciar uma expressão. Percorre o array procurando algum * / e cada vez que encontra é incrementado no contador. Assim que o contador estiver vazio, ela salva o primeiro elemento do array e inicia um loop que salva sempre o elemento n+1 e posteriormente o n. Se o contador não estiver vazio, ela realiza o começo do processo igual, porém enquanto o contador não estiver vazio, ele salvará o primeiro elemento em outro array (espera), e salva o elemento no array de saída da expressão. Quando o contador zerar, a fila vai para o array de saída e volta a percorrer o array de entrada.

Gramatica do analisador:

Primeiro elemento não pode ser um operador; Somente o primeiro operador será reconhecido, no caso de 10++-15, será reconhecido somente 10+15;

Dificuldades: Tivemos dificuldade principalmente em organizar o conteúdo para criação do trabalho, porém revendo as aulas e com ajuda do professor e de outros alunos chegamos até aqui.
