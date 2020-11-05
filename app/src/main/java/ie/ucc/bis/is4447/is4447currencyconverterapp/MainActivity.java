package ie.ucc.bis.is4447.is4447currencyconverterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText etEnterAmt = findViewById(R.id.etEnterAmt);
        final Spinner spType = (Spinner) findViewById(R.id.spType);
        final Spinner spType2 = (Spinner) findViewById(R.id.spType2);
        Button btnConvert = (Button) findViewById(R.id.btnConvert);
        Button btnConvertInSecondActivity = (Button) findViewById(R.id.btnConvertInSecondActivity);
        final TextView tvResult = (TextView) findViewById(R.id.tvResult);

        btnConvert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String etEnterText = String.valueOf(etEnterAmt.getText());
                double convertedValue, finalValue;

                if (etEnterText.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Please Enter A Currency", Toast.LENGTH_SHORT).show();
                }else{
                    final double AmtValue = Double.parseDouble(String.valueOf(etEnterAmt.getText()));
                    switch (spType2.getSelectedItemPosition()) {
                        case 0:
                            Toast.makeText(MainActivity.this, "Please Select A Currency Type", Toast.LENGTH_SHORT).show();
                            break;
                        case 1:
                            switch (spType.getSelectedItemPosition()){
                                case 0:
                                    Toast.makeText(MainActivity.this, "Please Select A Currency Type", Toast.LENGTH_SHORT).show();
                                    break;
                                case 1:
                                    convertedValue = convertToUSD2USD(AmtValue);
                                    finalValue = Math.round(convertedValue * 100.0)/100.0;
                                    tvResult.setText(etEnterText +" USD is\n" + String.valueOf(finalValue) + " USD" );
                                    tvResult.setVisibility(View.VISIBLE);
                                    break;
                                case 2:
                                    convertedValue = convertToUSD2Eur(AmtValue);
                                    finalValue = Math.round(convertedValue * 100.0)/100.0;
                                    tvResult.setText(etEnterText +" USD is\n" + String.valueOf(finalValue) + " Euro" );
                                    tvResult.setVisibility(View.VISIBLE);
                                    break;
                                case 3:
                                    convertedValue = convertToUSD2Pound(AmtValue);
                                    finalValue = Math.round(convertedValue * 100.0)/100.0;
                                    tvResult.setText(etEnterText +" USD is\n" + String.valueOf(finalValue) + " Pound" );
                                    tvResult.setVisibility(View.VISIBLE);

                                    break;
                            }
                            break;
                        case 2:
                            switch (spType.getSelectedItemPosition()){
                                case 0:
                                    Toast.makeText(MainActivity.this, "Please Select A Currency Type", Toast.LENGTH_SHORT).show();
                                    break;
                                case 1:
                                    convertedValue = convertToEuro2USD(AmtValue);
                                    finalValue = Math.round(convertedValue * 100.0)/100.0;
                                    tvResult.setText(etEnterText +" Euro is\n" + String.valueOf(finalValue) + " USD" );
                                    tvResult.setVisibility(View.VISIBLE);
                                    break;
                                case 2:
                                    convertedValue = convertToEuro2Euro(AmtValue);
                                    finalValue = Math.round(convertedValue * 100.0)/100.0;
                                    tvResult.setText(etEnterText +" Euro is\n" + String.valueOf(finalValue) + " Euro" );
                                    tvResult.setVisibility(View.VISIBLE);
                                    break;
                                case 3:
                                    convertedValue = convertToEuro2Pound(AmtValue);
                                    finalValue = Math.round(convertedValue * 100.0)/100.0;
                                    tvResult.setText(etEnterText +" Euro is\n" + String.valueOf(finalValue) + " Pound" );
                                    tvResult.setVisibility(View.VISIBLE);

                                    break;
                            }
                            break;
                        case 3:
                            switch (spType.getSelectedItemPosition()){
                                case 0:
                                    Toast.makeText(MainActivity.this, "Please Select A Currency Type", Toast.LENGTH_SHORT).show();
                                    break;
                                case 1:
                                    convertedValue = convertToPound2Dollar(AmtValue);
                                    finalValue = Math.round(convertedValue * 100.0)/100.0;
                                    tvResult.setText(etEnterText +" Pound is\n" + String.valueOf(finalValue) + " USD" );
                                    tvResult.setVisibility(View.VISIBLE);
                                    break;
                                case 2:
                                    convertedValue = convertToPound2Eur(AmtValue);
                                    finalValue = Math.round(convertedValue * 100.0)/100.0;
                                    tvResult.setText(etEnterText +" Pound is\n" + String.valueOf(finalValue) + " Euro" );
                                    tvResult.setVisibility(View.VISIBLE);
                                    break;
                                case 3:
                                    convertedValue = convertToPound2Pound(AmtValue);
                                    finalValue = Math.round(convertedValue * 100.0)/100.0;
                                    tvResult.setText(etEnterText +" Pound is\n" + String.valueOf(finalValue) + " Pound" );
                                    tvResult.setVisibility(View.VISIBLE);

                                    break;
                            }
                            break;
                    }
                }

            }
        });


        btnConvertInSecondActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvResult.setVisibility(View.INVISIBLE);
                String etEnterText = String.valueOf(etEnterAmt.getText());
                double convertedValue, finalValue;
                //TAG for log
                String TAG = "***IS4447****";

                Log.d(TAG,"VALUE " + etEnterText);

                if (etEnterText.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Please Enter A Temperature", Toast.LENGTH_SHORT).show();
                }else{
                    final double AmtValue = Double.parseDouble(String.valueOf(etEnterAmt.getText()));
                    Log.d(TAG,"VALUE " + AmtValue);
                    switch (spType2.getSelectedItemPosition()) {
                        case 0:
                            Toast.makeText(MainActivity.this, "Please Select A Currency Type", Toast.LENGTH_SHORT).show();
                            break;
                        case 1:
                            switch (spType.getSelectedItemPosition()){
                                case 0:
                                    Toast.makeText(MainActivity.this, "Please Select A Temperature Type", Toast.LENGTH_SHORT).show();
                                    break;
                                case 1:
                                    convertedValue = convertToUSD2USD(AmtValue);
                                    finalValue = Math.round(convertedValue * 100.0)/100.0;
                                    tvResult.setText(etEnterText +" USD is\n" + String.valueOf(finalValue) + " USD" );

                                    break;
                                case 2:
                                    convertedValue = convertToUSD2Eur(AmtValue);
                                    finalValue = Math.round(convertedValue * 100.0)/100.0;
                                    tvResult.setText(etEnterText +" USD is\n" + String.valueOf(finalValue) + " EURO" );

                                    break;
                                case 3:
                                    convertedValue = convertToUSD2Pound(AmtValue);
                                    finalValue = Math.round(convertedValue * 100.0)/100.0;
                                    tvResult.setText(etEnterText +" USD is\n" + String.valueOf(finalValue) + " POUND" );

                                    break;
                            }
                            break;
                        case 2:
                            switch (spType.getSelectedItemPosition()){
                                case 0:
                                    Toast.makeText(MainActivity.this, "Please Select A Temperature Type", Toast.LENGTH_SHORT).show();
                                    break;
                                case 1:
                                    convertedValue = convertToEuro2USD(AmtValue);
                                    finalValue = Math.round(convertedValue * 100.0)/100.0;
                                    tvResult.setText(etEnterText +" EURO is\n" + String.valueOf(finalValue) + " USD" );

                                    break;
                                case 2:
                                    convertedValue = convertToEuro2Euro(AmtValue);
                                    finalValue = Math.round(convertedValue * 100.0)/100.0;
                                    tvResult.setText(etEnterText +" EURO is\n" + String.valueOf(finalValue) + " EURO" );

                                    break;
                                case 3:
                                    convertedValue = convertToEuro2Pound(AmtValue);
                                    finalValue = Math.round(convertedValue * 100.0)/100.0;
                                    tvResult.setText(etEnterText +" EURO is\n" + String.valueOf(finalValue) + " POUND" );

                                    break;
                            }
                            break;
                        case 3:
                            switch (spType.getSelectedItemPosition()){
                                case 0:
                                    Toast.makeText(MainActivity.this, "Please Select A Temperature Type", Toast.LENGTH_SHORT).show();
                                    break;
                                case 1:
                                    convertedValue = convertToPound2Dollar(AmtValue);
                                    finalValue = Math.round(convertedValue * 100.0)/100.0;
                                    tvResult.setText(etEnterText +" Pound is\n" + String.valueOf(finalValue) + " USD" );

                                    break;
                                case 2:
                                    convertedValue = convertToPound2Eur(AmtValue);
                                    finalValue = Math.round(convertedValue * 100.0)/100.0;
                                    tvResult.setText(etEnterText +" Pound is\n" + String.valueOf(finalValue) + " EURO" );

                                    break;
                                case 3:
                                    convertedValue = convertToPound2Pound(AmtValue);
                                    finalValue = Math.round(convertedValue * 100.0)/100.0;
                                    tvResult.setText(etEnterText +" Pound is\n" + String.valueOf(finalValue) + " POUND" );

                                    break;
                            }
                            break;
                    }



                    Intent startIntent = new Intent(getApplicationContext(), SecondActivity.class);
                    startIntent.putExtra("PASSING_RESULT", tvResult.getText().toString());
                    startActivity(startIntent);
                }
            }
        });

    }

    public double convertToEuro2USD(double EurValue){

        double resultValue;
        resultValue = (EurValue * 1.17);
        return resultValue;
    }
    public double convertToEuro2Euro(double EurValue){

        double resultValue;
        resultValue = (EurValue);
        return resultValue;
    }
    public double convertToEuro2Pound(double EurValue){

        double resultValue;
        resultValue = (EurValue * .91);
        return resultValue;
    }

    public double convertToUSD2Eur(double USDValue){
        double resultValue;
        resultValue = (USDValue / 1.17);
        return resultValue;
    }
    public double convertToUSD2USD(double USDValue){
        double resultValue;
        resultValue = (USDValue);
        return resultValue;
    }
    public double convertToUSD2Pound(double USDValue){
        double resultValue;
        resultValue = (USDValue / 1.17 ) * .91;
        return resultValue;
    }
    public double convertToPound2Pound(double PoundValue){
        double resultValue;
        resultValue = (PoundValue);
        return resultValue;
    }
    public double convertToPound2Eur(double PoundValue){
        double resultValue;
        resultValue = (PoundValue / .91);
        return resultValue;
    }
    public double convertToPound2Dollar(double PoundValue){
        double resultValue;
        resultValue = (PoundValue / .91) * 1.17;
        return resultValue;
    }

}