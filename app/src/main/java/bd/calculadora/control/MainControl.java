package bd.calculadora.control;

import android.app.Activity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import bd.calculadora.R;
import bd.calculadora.model.Calcula;
import bd.calculadora.model.CalculaBO;

public class MainControl {
    private Activity activity;
    private EditText editN1;
    private EditText editN2;
    private Button btSoma;
    private Button btSub;
    private Button btMultiplicacao;
    private Button btDivisao;
    private LinearLayout lyResultado;
    private TextView tvResultado;
    private CalculaBO cBO;

    public MainControl(Activity activity) {
        this.activity = activity;
        cBO = new CalculaBO();
        initComponents();
        editN1.requestFocus();
    }

    private void initComponents() {
        editN1 = activity.findViewById(R.id.editN1);
        editN2 = activity.findViewById(R.id.editN2);
        btSoma = activity.findViewById(R.id.btSoma);
        btSub = activity.findViewById(R.id.btSub);
        btDivisao = activity.findViewById(R.id.btDivisao);
        btMultiplicacao = activity.findViewById(R.id.btMultiplicacao);
        lyResultado = activity.findViewById(R.id.lyResultado);
    }

    public void somaAction() {
        Calcula calcula = new Calcula();
        CalculaBO cBO = new CalculaBO(calcula);
        calcula.setN1(editN1.getText().toString());
        calcula.setN2(editN2.getText().toString());

        if (!CalculaBO.validaN1(calcula)) {
            editN1.setError(activity.getString(R.string.erro_n1));
            Toast.makeText(activity, R.string.erro_n1, Toast.LENGTH_SHORT).show();
            return;
        }

        if (!CalculaBO.validaN2(calcula)) {
            editN2.setError(activity.getString(R.string.erro_n2));
            Toast.makeText(activity, R.string.erro_n2, Toast.LENGTH_SHORT).show();
            return;
        }

        TextView tvNewResultado = new TextView(activity);
        tvNewResultado.setText(String.valueOf(calcula.getN1() + " + " + calcula.getN2()) + " = " + cBO.soma());
        lyResultado.addView(tvNewResultado);
        limpaCampo();
    }

    public void subtracaoAction() {
        Calcula calcula = new Calcula();
        CalculaBO cBO = new CalculaBO(calcula);
        calcula.setN1(editN1.getText().toString());
        calcula.setN2(editN2.getText().toString());

        if (!CalculaBO.validaN1(calcula)) {
            editN1.setError(activity.getString(R.string.erro_n1));
            Toast.makeText(activity, R.string.erro_n1, Toast.LENGTH_SHORT).show();
            return;
        }

        if (!CalculaBO.validaN2(calcula)) {
            editN2.setError(activity.getString(R.string.erro_n2));
            Toast.makeText(activity, R.string.erro_n2, Toast.LENGTH_SHORT).show();
            return;
        }

        TextView tvNewResultado = new TextView(activity);
        tvNewResultado.setText(String.valueOf(calcula.getN1() + " - " + calcula.getN2()) + " = " + cBO.subtracao());
        lyResultado.addView(tvNewResultado);
        limpaCampo();
    }

    public void divisaoAction() {
        Calcula calcula = new Calcula();
        CalculaBO cBO = new CalculaBO(calcula);
        calcula.setN1(editN1.getText().toString());
        calcula.setN2(editN2.getText().toString());

        if (!CalculaBO.validaN1(calcula)) {
            editN1.setError(activity.getString(R.string.erro_n1));
            Toast.makeText(activity, R.string.erro_n1, Toast.LENGTH_SHORT).show();
            return;
        }

        if (!CalculaBO.validaN2(calcula)) {
            editN2.setError(activity.getString(R.string.erro_n2));
            Toast.makeText(activity, R.string.erro_n2, Toast.LENGTH_SHORT).show();
            return;
        }

        TextView tvNewResultado = new TextView(activity);
        tvNewResultado.setText(String.valueOf(calcula.getN1() + " / " + calcula.getN2()) + " = " + cBO.divisao());
        lyResultado.addView(tvNewResultado);
        limpaCampo();
    }

    public void multiplicacaoAction() {
        Calcula calcula = new Calcula();
        CalculaBO cBO = new CalculaBO(calcula);
        calcula.setN1(editN1.getText().toString());
        calcula.setN2(editN2.getText().toString());

        if (!CalculaBO.validaN1(calcula)) {
            editN1.setError(activity.getString(R.string.erro_n1));
            Toast.makeText(activity, R.string.erro_n1, Toast.LENGTH_SHORT).show();
            return;
        }

        if (!CalculaBO.validaN2(calcula)) {
            editN2.setError(activity.getString(R.string.erro_n2));
            Toast.makeText(activity, R.string.erro_n2, Toast.LENGTH_SHORT).show();
            return;
        }

        TextView tvNewResultado = new TextView(activity);
        tvNewResultado.setText(String.valueOf(calcula.getN1() + " x " + calcula.getN2()) + " = " + cBO.multiplicacao());
        lyResultado.addView(tvNewResultado);
        limpaCampo();
    }

    public void limpaCampo() {
        editN1.setText("");
        editN2.setText("");
        editN1.requestFocus();
    }
}
