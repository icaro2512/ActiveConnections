package info.lifeti.activeconnections11.DAO;

import org.ksoap2.SoapEnvelope;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapPrimitive;
import org.ksoap2.serialization.SoapSerializationEnvelope;
import org.ksoap2.transport.HttpTransportSE;
import org.xmlpull.v1.XmlPullParserException;

import java.io.IOException;
import java.util.ArrayList;

import info.lifeti.activeconnections11.Model.Usuario;

/**
 * Created by Administrador on 01/03/2016.
 */
public class UsuarioDAO {


    private static final String URL = "http://192.168.0.100:8080/ExemploWS/services/UsuarioDAO?wsdl";
    private static final String NAMESPACE = "http://ws.com.br";

    private static final String INSERIR = "inserirUsuario";
    private static final String EXCLUIR = "excluirUsuario";
    private static final String ATUALIZAR = "atualizarUsuario";
    private static final String BUSCAR_TODOS = "buscarTodosUsuarios";
    private static final String BUSCAR_POR_ID = "buscarUsuarioPorID";


        public boolean inserirUsuario(Usuario u) {

            SoapObject inserirUsuario = new SoapObject(NAMESPACE,INSERIR);
            SoapObject usuario = new SoapObject(NAMESPACE,"usuario");

            usuario.addProperty("id",u.getUsuId());
            usuario.addProperty("idade",u.getUsuIdade());
            usuario.addProperty("nome",u.getUsuApelido());

            //Chama o Método usuario dentro do inserirUsuario
            inserirUsuario.addSoapObject(usuario);

            //Criar um envelope com essa estrutura para enviar pro WS
            SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
            envelope.setOutputSoapObject(inserirUsuario);

            //Habilitar a Flag, se não colocar como true não vai funcionar
            envelope.implicitTypes = true;

            //Criando o objeto que envia para o WS o envelope usando a URL do WS
            HttpTransportSE http = new HttpTransportSE(URL);
            try {
                http.call("urn:" + INSERIR, envelope);

                //pegando a resposta do envelope


                SoapPrimitive resposta = (SoapPrimitive) envelope.getResponse();
                return Boolean.parseBoolean(resposta.toString());


            } catch (Exception e) {
                e.printStackTrace();
                return false;
            }


        }

        public boolean excluirUsuario(int id) {
            return excluirUsuario(
                    new Usuario(id,"",0)
            );
        }

        public boolean excluirUsuario(Usuario u) {



            return true;
        }


        public ArrayList<Usuario> buscarTodosUsuarios() {
            ArrayList<Usuario> lista = new ArrayList<Usuario>();


            return lista;
        }

        public Usuario buscarUsuarioPorID(int id) {
            Usuario u = null;

            return u;
        }

        public boolean atualizarUsuario(Usuario u) {


            return true;
        }


    }
