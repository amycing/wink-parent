import org.java_websocket.WebSocket;
import org.java_websocket.handshake.ClientHandshake;
import org.java_websocket.server.WebSocketServer;

import java.net.InetSocketAddress;
import java.net.UnknownHostException;

public class ServerDemo  extends WebSocketServer {
    public ServerDemo() throws UnknownHostException {
    }

    public ServerDemo(int port) throws UnknownHostException {
        super(new InetSocketAddress(port));
        System.out.println("websocket Server start at port:"+port);
    }
    /**
     * 触发连接事件
     */
    @Override
    public void onOpen(WebSocket webSocket, ClientHandshake clientHandshake) {
        System.out.println("new connection ===" +webSocket.getRemoteSocketAddress().getAddress().getHostAddress());
    }
    /**
     *
     * 连接断开时触发关闭事件
     */
    @Override
    public void onClose(WebSocket webSocket, int i, String s, boolean b) {
        System.out.println("连接断开时触发关闭事件");
    }

    /**
     * 客户端发送消息到服务器时触发事件
     */
    @Override
    public void onMessage(WebSocket webSocket, String message) {
        System.out.println("you have a new message: "+ message);
        //向客户端发送消息
        webSocket.send(message);
    }
    /**
     * 触发异常事件
     */
    @Override
    public void onError(WebSocket webSocket, Exception e) {
        if( webSocket != null ) {
            System.out.println("触发异常事件");
            //some errors like port binding failed may not be assignable to a specific websocket
        }
    }

    @Override
    public void onStart() {
        System.out.println("触发启动事件");
    }

    /**
     * 启动服务端
     * @param args
     * @throws UnknownHostException
     */
    public static void main(String[] args) throws UnknownHostException {
        new ServerDemo(8999).start();
    }

}
