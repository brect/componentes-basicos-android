package br.com.blimas.componentesBasicos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private TextView campoProduto;
    private TextView resultado;
    private CheckBox checkBoxBranco, checkBoxVerde, checkBoxVermelho;
    List<String> check = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        campoProduto = findViewById(R.id.nome_produto);
        resultado = findViewById(R.id.resultado_produto);

        checkBoxBranco = findViewById(R.id.checkBox_cor_branco);
        checkBoxVerde = findViewById(R.id.checkBox_cor_verde);
        checkBoxVermelho = findViewById(R.id.checkBox_cor_vermelho);
    }

    public void btnEnviar(View view){
        String valorTextoProduto = campoProduto.getText().toString();
        resultado.setText(valorTextoProduto);
    }

    public void verificaCheckBox (){
        //verifica e limpa a lista antes de salvar o valor
        check.clear();


        //verifica se o checkbox esta ativo
        if (checkBoxBranco.isChecked()){
            check.add(checkBoxBranco.getText().toString());
        }
        if (checkBoxVerde.isChecked()){
            check.add(checkBoxVerde.getText().toString());
        }
        if (checkBoxVermelho.isChecked()){
            check.add(checkBoxVermelho.getText().toString());
        }

        //retorna valores selecionados pelo usuario
        resultado.setText(check.toString());
    }
}
