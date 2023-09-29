# DesignPattern
PADRÕES DE PROJETO GOF ADAPTER E STRATEGY, BRIDGE E FACTORY METHOD
1) Imagine uma situação onde tem-se um sistema para registrar pedidos de refeições em um
restaurante. Considere que existem duas opções disponíveis de refeições e para ter acesso à
descrição e valor de cada uma, é preciso instanciar um pedido de acordo com a opção
desejada. Aplique o padrão GoF Factory Method para criar os objetos, seguindo o que se pede:
a) Crie uma classe base e duas classes derivando dela, referentes a duas opções de refeição
disponíveis, que você deve definir.
b) Crie uma classe factory que fará a decisão de qual subclasse retornar de acordo com um
parâmetro passado ao método responsável por criar a refeição.
c) Crie uma classe Main que irá testar a solicitação de pedido das duas opções de refeições,
fazendo uso da factory criada, apresentando os dados do pedido realizado e o valor
correspondente.
2) Considere uma aplicação, em que há uma classe responsável por salvar um arquivo, com
objetivo e atributos diversos que podem ser criados à sua escolha. É preciso criar uma
estratégia para indicar o formato de arquivo a ser gerado: XML – dados dos atributos
impressos delimitados por tags; CSV – dados dos atributos impressos separados por vírgula;
JSON – dados dos atributos impressos em pares de valores-chave. Utilize o padrão GoF
Strategy para organizar a estrutura de classes necessária para que um programa possa fazer
uso da estratégia criada, simulando a criação de arquivos nos três formatos disponíveis.
3) Considere que um usuário possui dois telefones celulares, de marcas diferentes, como
Samsung e Xiaomi. Suponha que cada celular possui duas câmeras, uma frontal e outra
traseira. Um programa deve permitir a realização de captura de fotos usando os dois celulares
e as duas câmeras. O usuário final deve trabalhar com o dispositivo sem se preocupar com o
uso das câmeras. Em vez de criar uma estrutura que considere as 4 diferentes combinações de
câmeras de acordo com a marca, empregue o padrão de projeto GoF Bridge para separar as
abstrações(O que se pretende fazer: usar os celulares de diferentes marcas para capturar foto)
das suas implementações (Como será implementado: Funcionamento das câmeras frontal e
traseira).
Ao executar o programa, deve ser possível simular o uso das 4 possibilidades:
Captura via celular Samsung
Foto capturada via câmera frontal
Captura via celular Samsung
Foto capturada via câmera traseira
Captura via celular Xiaomi
Foto capturada via câmera frontal
Captura via celular Xiaomi
Foto capturada via câmera traseira
4) Apresente uma aplicação do padrão de projeto GoF Adapter em um dos projetos utilizados
para resolver as questões anteriores. Comente o código de forma a indicar com que objetivo
o padrão foi aplicado, e quais alterações foram realizadas no código para atender o que sugere
o padrão.
