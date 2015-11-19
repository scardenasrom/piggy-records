package herkiusdev.com.piggy_records.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.ViewById;

import herkiusdev.com.piggy_records.R;

@EFragment(R.layout.fragment_withdraw)
public class WithdrawFragment extends Fragment implements View.OnClickListener {

    @ViewById(R.id.withdraw_quantity)
    TextView withdrawText;
    @ViewById(R.id.withdraw_comma)
    Button withdrawComma;
    @ViewById(R.id.withdraw_validate)
    ImageButton withdrawValidate;
    @ViewById(R.id.withdraw_delete)
    ImageButton withdrawDelete;
    @ViewById(R.id.withdraw_zero)
    Button withdrawZero;
    @ViewById(R.id.withdraw_one)
    Button withdrawOne;
    @ViewById(R.id.withdraw_two)
    Button withdrawTwo;
    @ViewById(R.id.withdraw_three)
    Button withdrawThree;
    @ViewById(R.id.withdraw_four)
    Button withdrawFour;
    @ViewById(R.id.withdraw_five)
    Button withdrawFive;
    @ViewById(R.id.withdraw_six)
    Button withdrawSix;
    @ViewById(R.id.withdraw_seven)
    Button withdrawSeven;
    @ViewById(R.id.withdraw_eight)
    Button withdrawEight;
    @ViewById(R.id.withdraw_nine)
    Button withdrawNine;

    private String calcText;

    @AfterViews
    public void initViews(){
        loadButtons();
    }

    private void loadButtons(){
        withdrawComma.setOnClickListener(this);
        withdrawDelete.setOnClickListener(this);
        withdrawValidate.setOnClickListener(this);
        withdrawZero.setOnClickListener(this);
        withdrawOne.setOnClickListener(this);
        withdrawTwo.setOnClickListener(this);
        withdrawThree.setOnClickListener(this);
        withdrawFour.setOnClickListener(this);
        withdrawFive.setOnClickListener(this);
        withdrawSix.setOnClickListener(this);
        withdrawSeven.setOnClickListener(this);
        withdrawEight.setOnClickListener(this);
        withdrawNine.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v == withdrawZero) {
            write("0");
        } else if (v == withdrawOne) {
            write("1");
        } else if (v == withdrawTwo) {
            write("2");
        } else if (v == withdrawThree) {
            write("3");
        } else if (v == withdrawFour) {
            write("4");
        } else if (v == withdrawFive) {
            write("5");
        } else if (v == withdrawSix) {
            write("6");
        } else if (v == withdrawSeven) {
            write("7");
        } else if (v == withdrawEight) {
            write("8");
        } else if (v == withdrawNine) {
            write("9");
        } else if (v == withdrawComma) {
            writeComma();
        } else if (v == withdrawDelete) {
            delete();
        } else if (v == withdrawValidate) {
            validateWithdraw();
        }
    }

    private void write(String s){
        calcText = withdrawText.getText().toString();
        if (!calcText.contains(",")){
            if (calcText.equals("0")){
                withdrawText.setText(s);
            } else {
                withdrawText.setText(calcText+s);
            }
        } else {
            String parts[] = calcText.split(",");
            if (parts.length == 1){
                withdrawText.setText(calcText+s);
            } else {
                if (parts[1].length()<2){
                    withdrawText.setText(calcText+s);
                }
            }
        }
    }

    private void writeComma(){
        calcText = withdrawText.getText().toString();
        if (!calcText.contains(",")){
            withdrawText.setText(calcText+",");
        }
    }

    private void delete(){
        calcText = withdrawText.getText().toString();
        if (calcText.length()==1){
            withdrawText.setText("0");
        } else {
            calcText = calcText.substring(0, calcText.length()-1);
            withdrawText.setText(calcText);
        }
    }

    private void validateWithdraw(){
        calcText = withdrawText.getText().toString().replace(",", ".");
        float withdrawAmount = Float.parseFloat(calcText);
        //TODO Extraer la cantidad de la cuenta que sea, comprobando primero si es posible
        withdrawText.setText("0");
    }

}
