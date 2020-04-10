# Introdução

Este projeto abriga uma tarefa que fiz para conseguir 
cumprir uma atividade da JetBrains Academy.

## Motivação

A atividade assumia que a classe com o método ```main``` tinha
acesso a algumas classes que eu não tinha, o que dificulta o 
processo de testes da solução.

Por este motivo decidi implementar as classes que a suposta classe com 
o método ```main``` teria acesso.

## A atividade.

A atividade ficava no módulo de ENUMs do curso e assumia que 
você tinha três classes (um enum de direção e uma classe robot 
e uma classe com o método ```main```), neste cenário o método 
```main``` irá iniciar um ```Robot``` com um grupo de coordenadas
```x``` e ```y``` e irá chamar um método com a assinatura 
```moveRobot(Robot robot, int toX, int toY)``` para mover o robô
para as novas coordenadas ```x```, ```y```.

O objetivo do estudante é implementar a lógica do método ```moveRobot```.

Além desta informação foi informado ao estudante que o ```Robot``` 
tem os seguintes métodos: 

 - ```Direction getDirection()``` - Para obter a direção que o robô está apontado.
 - ```int getX()``` - Para obter a coordenada ```x``` do robô.
 - ```int getY()``` - Para obter a coordenada ```y``` do robô.
 - ```void turnLeft()``` - Para rotacionar o robô em 90º
 - ```void turnRight()``` - Para rotacionar o robô em -90º
 - ```void stepForward()``` - Para o robô andar um passo na direção que está virado.

Além disso também foi passado um ````enum```` chamado ```Direction``` que possui os seguintes valores:

 - ```UP``` - Virado para cima (Quando o robô andar aumenta 1 na coordenada do eixo Y)
 - ```DOWN``` - Virado para baixo (Quando o robô andar diminui 1 na coordenada do eixo Y)
 - ```LEFT``` - Virado para esquerda (Quando o robô andar aumenta 1 na coordenada do eixo X)
 - ```RIGHT``` - Virado para direita (Quando o robô andar diminui 1 na coordenada do eixo X)
   
