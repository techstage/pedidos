## Live 1: techstage.io

<h1>app-pedido</h1>

<h3>Payload de exemplo</h3>
<code>
{<br>
  &nbsp;&nbsp;"id": 1,<br>
  &nbsp;&nbsp;"transacao": 1000,<br>
  &nbsp;&nbsp;"pagamento": 100,<br>
  &nbsp;&nbsp;"cliente": 1,<br>
  &nbsp;&nbsp;"nome": "cliente 1",<br>
  &nbsp;&nbsp;"email": "cliente1@techsage.io"<br>
}
</code>

<h1>URI dos Recursos</h1>

<p>
  <b>GET</b><br>
  &nbsp;&nbsp;<a href="http://localhost:9010/pedidos">http://localhost:9010/pedidos</a>
</p>

<p>
  <b>POST</b> (Necessário enviar o Payload)<br>
  &nbsp;&nbsp;<a href="http://localhost:9010/pedidos">http://localhost:9010/pedidos</a>
  
</p>

<p>
  <b>PUT</b> (Necessário enviar o Payload)<br>
  &nbsp;&nbsp;<a href="http://localhost:9010/pedidos/id">http://localhost:9010/pedidos/id</a>
</p>

<p>
  <b>DELETE</b><br>
  &nbsp;&nbsp;<a href="http://localhost:9010/pedidos/id">http://localhost:9010/pedidos/id</a>
</p>

<p>
  <h1>URL do Front-End</h1>
  O Front-end é outra aplicação, que consome as Recursos descritos anterioremente e mostra uma tela no browser é possível acessa-la em <a href="http://localhost:9015">http://localhost:9015</a>
</p>