package bd.calculadora.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import bd.calculadora.R;
import bd.calculadora.control.MainControl;

public class MainActivity extends AppCompatActivity {
    private MainControl control;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        control = new MainControl(this);
    }

    public void soma(View view) {
        control.somaAction();
    }

    public void multiplicacao(View view) {
        control.multiplicacaoAction();
    }

    public void subtracao(View view) {
        control.subtracaoAction();
    }

    public void divisao(View view) {
        control.divisaoAction();
    }
}
