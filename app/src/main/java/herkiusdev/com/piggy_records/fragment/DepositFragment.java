package herkiusdev.com.piggy_records.fragment;

import android.support.v4.app.Fragment;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.ViewById;

import herkiusdev.com.piggy_records.R;

@EFragment(R.layout.fragment_deposit)
public class DepositFragment extends Fragment implements View.OnClickListener {

    @ViewById(R.id.deposit_quantity)
    TextView depositText;
    @ViewById(R.id.deposit_comma)
    Button depositComma;
    @ViewById(R.id.deposit_validate)
    ImageButton depositValidate;
    @ViewById(R.id.deposit_delete)
    ImageButton depositDelete;
    @ViewById(R.id.deposit_zero)
    Button depositZero;
    @ViewById(R.id.deposit_one)
    Button depositOne;
    @ViewById(R.id.deposit_two)
    Button depositTwo;
    @ViewById(R.id.deposit_three)
    Button depositThree;
    @ViewById(R.id.deposit_four)
    Button depositFour;
    @ViewById(R.id.deposit_five)
    Button depositFive;
    @ViewById(R.id.deposit_six)
    Button depositSix;
    @ViewById(R.id.deposit_seven)
    Button depositSeven;
    @ViewById(R.id.deposit_eight)
    Button depositEight;
    @ViewById(R.id.deposit_nine)
    Button depositNine;

    private String calcText;

    @AfterViews
    public void initViews(){
        loadButtons();
    }

    private void loadButtons(){
        depositZero.setOnClickListener(this);
        depositOne.setOnClickListener(this);
        depositTwo.setOnClickListener(this);
        depositThree.setOnClickListener(this);
        depositFour.setOnClickListener(this);
        depositFive.setOnClickListener(this);
        depositSix.setOnClickListener(this);
        depositSeven.setOnClickListener(this);
        depositEight.setOnClickListener(this);
        depositNine.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v == depositZero) {
            write("0");
        } else if (v == depositOne) {
            write("1");
        } else if (v == depositTwo) {
            write("2");
        } else if (v == depositThree) {
            write("3");
        } else if (v == depositFour) {
            write("4");
        } else if (v == depositFive) {
            write("5");
        } else if (v == depositSix) {
            write("6");
        } else if (v == depositSeven) {
            write("7");
        } else if (v == depositEight) {
            write("8");
        } else if (v == depositNine) {
            write("9");
        }
    }

    private void write(String s){
        calcText = depositText.getText().toString();
        if (calcText.equals("0")){
            depositText.setText(s);
        } else {
            depositText.setText(calcText+s);
        }
    }

}
