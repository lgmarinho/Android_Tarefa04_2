package ucam.java.android.acessoprincipal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class PrincipalActivity extends AppCompatActivity {

    private Button botaoOk;
    private Button botaoCancelar;
    private EditText usuarioEditText;
    private EditText senhaEditText;
    private TextView resultadoTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        usuarioEditText = (EditText) findViewById(R.id.usuarioEditText);
        senhaEditText = (EditText) findViewById(R.id.senhaEditText);
        resultadoTextView = (TextView) findViewById(R.id.resultadotextView);

        botaoCancelar = (Button) findViewById(R.id.cancelarButton);
        botaoCancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cancelarButtonAction();
            }
        });

        botaoOk = (Button) findViewById(R.id.acessoButton);
        botaoOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                okBotaoAction();
            }
        });
    }



    private void cancelarButtonAction() {

        usuarioEditText.setText(null);
        senhaEditText.setText(null);
        resultadoTextView.setText(null);

    }

    private void okBotaoAction() {

        String usuarioInserido = usuarioEditText.getText().toString();
        String senhaInserida = senhaEditText.getText().toString();

        if(usuarioInserido.equalsIgnoreCase( "LuizGustavo") &&
                senhaInserida.equals("123456")) {
            resultadoTextView.setText("Acesso permitido!");

        }else{

            resultadoTextView.setText("Acesso negado");

        }
    }
}
