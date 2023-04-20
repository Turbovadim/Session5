package net.turbovadim.session5

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.net.ssl.SSLSocketFactory
import org.java_websocket.client.WebSocketClient
import org.java_websocket.handshake.ServerHandshake
import java.lang.Exception
import java.net.URI

class WebsocketVM: ViewModel() {

    lateinit var websocketClient: WebSocketClient

    fun websocketInit() {
        viewModelScope.launch(Dispatchers.IO) {
            createWebsocketClient()
            websocketClient.addHeader("token", "tokenGoesHere")
            websocketClient.connect()
        }
    }

    private fun createWebsocketClient() {
        websocketClient = object : WebSocketClient(URI("SOCKETURL")) {
            override fun onOpen(handshakedata: ServerHandshake?) {

            }

            override fun onClose(code: Int, reason: String?, remote: Boolean) {

            }

            override fun onMessage(message: String?) {

            }

            override fun onError(ex: Exception?) {
                websocketClient.send("")
            }
        }
    }

    private fun messageHandler() {

    }
}