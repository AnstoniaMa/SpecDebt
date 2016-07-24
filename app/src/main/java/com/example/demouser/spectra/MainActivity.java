

package com.example.demouser.spectra;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.TextWatcher;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.text.Editable;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
//    EditText totalBill = (EditText) findViewById(R.id.summary);
//    private final TextWatcher decimalWatcher = new TextWatcher() {
//        public void beforeTextChanged(CharSequence s, int start, int count, int after){
//
//        }
//        public void onTextChanged(CharSequence s, int start,
//                                  int before, int count) {
//            if(!s.toString().equals(null)) {
//                totalBill.removeTextChangedListener(this);
//                String money = s.toString().replaceAll("[$,.]","");
//                double finishedMoney = Double.parseDouble(money);
//                String formatted = NumberFormat.getCurrencyInstance().format((finishedMoney/100));
//                String current = formatted;
//                totalBill.setText(formatted);
//                totalBill.setSelection(formatted.length());
//                totalBill.addTextChangedListener(this);
//            }
//
//        }
//        public void afterTextChanged(Editable s) {
//        }
//    };

//}
    double bill = 0;
    public void makeCurrency(View view) {
//        Intent intent = new Intent(Intent.ACTION_SENDTO);
//        intent.setData(Uri.parse("mailto:"));

        EditText totalBill = (EditText) findViewById(R.id.my_edit_text);
        double amount = Double.parseDouble(totalBill.getText().toString());
        NumberFormat finalAmount = new DecimalFormat("#0.00");
        double thing = Double.parseDouble(finalAmount.format(amount));
        System.out.println(thing);
        bill = thing;

        TextView summaryTextView = (TextView) findViewById(R.id.amountSummary);
        summaryTextView.setText(Double.toString(thing));
//
//        intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"sujeethjinesh@gmail.com"});
//        intent.putExtra(Intent.EXTRA_TEXT, totalBill.getText());

//        if (intent.resolveActivity(getPackageManager()) != null) {
//            startActivityForResult(intent, 0);
//        }

    }
    ArrayList<String> peopleArray = new ArrayList<String>();
//    private View.onClickListener onClick() {
//
//    }
    public void nameButton (View view) {
        EditText people = (EditText) findViewById(R.id.names);
        peopleArray.add(people.getText().toString());
        TextView summaryTextView = (TextView) findViewById(R.id.nameSummary);
        String names = "";
        for (int i = 0; i < peopleArray.size(); i++){
            if (i== peopleArray.size() -1) {
                names+=peopleArray.get(i);
            }
            else{
                names+=peopleArray.get(i);
                names+=", ";
            }

        }
        summaryTextView.setText(names);
        TextView sumTextView = (TextView) findViewById(R.id.split);
        NumberFormat finalAmount = new DecimalFormat("#0.00");
        double splitted = bill/peopleArray.size();
        double finalShit = Double.parseDouble(finalAmount.format(splitted));
        sumTextView.setText(Double.toString(finalShit));
        people.setText("");
    }
}

//    public void facebookMethod(View view) {
//        Uri uri = Uri.parse("http://www.facebook.com/sujeethjinesh");
//        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
//        startActivity(intent);
//    }



//}
