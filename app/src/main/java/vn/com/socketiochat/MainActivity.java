package vn.com.socketiochat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.nkzawa.socketio.client.IO;
import com.github.nkzawa.socketio.client.Socket;

import java.net.URISyntaxException;

public class MainActivity extends AppCompatActivity {
    private Socket mSocket;

    {
        try

        {
            mSocket = IO.socket("http://chat.socket.io");
        } catch (
                URISyntaxException e)

        {

        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mSocket.connect();

    }
}
