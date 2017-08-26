package br.ufjf.dcc19.dcc196eemplo02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class PrincipalActivity extends AppCompatActivity {
    private EditText numero1;
    private EditText numero2;
    private TextView resultado;
    private Button  botaoCalcular;
    private Button botaoSubtrair;
    private Button botaoMultiplicar;
    private Button botaoDividir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);


        //1- Enontre os componentes entrada
        numero1 = (EditText) findViewById(R.id.numero1);
        numero2 = (EditText) findViewById(R.id.numero2);
        //2- Proure os componentes de saida
        resultado = (TextView) findViewById(R.id.resultado);
        //3- Procure os componentes de controle
        botaoCalcular = (Button) findViewById(R.id.calcular);
        //4- Configurar os ouvintes para eventos

        botaoSubtrair = (Button) findViewById(R.id.subtrair);
        botaoMultiplicar = (Button) findViewById(R.id.multiplicar);
        botaoDividir = (Button) findViewById(R.id.Dividir);

        Ouvinte ouvinteInstancia = new Ouvinte();
        botaoCalcular.setOnClickListener(ouvinteInstancia);
        Ouvintedois ouvinteInstanciaa= new Ouvintedois();
        botaoSubtrair.setOnClickListener(ouvinteInstanciaa);
        Ouvintetres ouvinteInstaciab= new Ouvintetres();
        botaoMultiplicar.setOnClickListener(ouvinteInstaciab);
        Ouvintequatro ouvinteInstaciac = new Ouvintequatro();
        botaoDividir.setOnClickListener(ouvinteInstaciac);
    }

    private class Ouvinte implements View.OnClickListener {
        @Override
        public void onClick(View view){
            Integer n1= Integer.parseInt(numero1.getText().toString());
            Integer n2= Integer.parseInt(numero2.getText().toString());

            Integer soma = n1+n2;

            resultado.setText("A soma de "+n1+" e "+n2+" é: "+soma);
        }
    }

    private class Ouvintedois implements View.OnClickListener {
        @Override
        public void onClick(View view){
            Integer n1 = Integer.parseInt(numero1.getText().toString());
            Integer n2 = Integer.parseInt(numero2.getText().toString());

            Integer subtracao = n1-n2;

            resultado.setText("A subtracao de "+n1+ "e "+n2+" é: " +subtracao);

        }
    }

    private class Ouvintetres implements View.OnClickListener {
        @Override
        public void onClick(View view){

        Integer n1 = Integer.parseInt(numero1.getText().toString());
        Integer n2 = Integer.parseInt(numero2.getText().toString());

        Integer multiplicacao = n1*n2;

        resultado.setText("a multiplicacao de "+n1+ "e "+n2+ " é: " +multiplicacao);

    }
    }

    private class Ouvintequatro implements View.OnClickListener {
        @Override
        public void onClick(View view) {


            Integer n1 = Integer.parseInt(numero1.getText().toString());
            Integer n2 = Integer.parseInt(numero2.getText().toString());

            Integer divisao = n1 / n2;

            resultado.setText("a divisao e " + n1 + "e" + n2 + " é: " + divisao);
        }
    }
    }


