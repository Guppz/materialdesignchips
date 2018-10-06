package com.example.fran.materialdesignchips;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.chip.Chip;
import android.support.design.chip.ChipGroup;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.fran.materialdesignchips.Entity.Eventos;
import com.google.android.flexbox.FlexboxLayout;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnTextChanged;
import fisk.chipcloud.ChipCloud;
import fisk.chipcloud.ChipCloudConfig;
import fisk.chipcloud.ChipDeletedListener;
import fisk.chipcloud.ChipListener;


public class MainActivity extends AppCompatActivity {


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fristChips();
        secondChips();
        thirdChips();
    }




    //Primeros chips que podemos selecionar varios al mismo tiempo
    public void fristChips(){
        FlexboxLayout flexboxDrawable = (FlexboxLayout) findViewById(R.id.flexbox_1);
        ChipCloudConfig drawableConfig = new ChipCloudConfig()
                //selecion del tipo de chio
                .selectMode(ChipCloud.SelectMode.multi)
                //selecion del color del chip
                .checkedChipColor(Color.parseColor("#ddaa00"))
                //selecion del color del texto del chip
                .checkedTextColor(Color.parseColor("#ffffff"))
                //selecion del color del chip selecionado
                .uncheckedChipColor(Color.parseColor("#e0e0e0"))
                .uncheckedTextColor(Color.parseColor("#000000"));
        //aqui comensamos un nuevo chip manager con los espificasion del chip anterior y el layout que queremos usar
        ChipCloud drawableChipCloud = new ChipCloud(this, flexboxDrawable, drawableConfig);
        drawableChipCloud.addChip("Correr");
        drawableChipCloud.addChip("Nadar");
        drawableChipCloud.addChip("Ciclismo");
        drawableChipCloud.addChip("Tennis");
    }


    public void secondChips(){
        FlexboxLayout flexboxDrawable = (FlexboxLayout) findViewById(R.id.flexbox_2);
        ChipCloudConfig drawableConfig = new ChipCloudConfig()
                //selecion del tipo de chip que sea solamente 1
                .selectMode(ChipCloud.SelectMode.single)
                //selecion del color del chip
                .checkedChipColor(Color.parseColor("#ddaa00"))
                //selecion del color del texto del chip
                .checkedTextColor(Color.parseColor("#ffffff"))
                //selecion del color del chip selecionado
                .uncheckedChipColor(Color.parseColor("#e0e0e0"))
                .uncheckedTextColor(Color.parseColor("#000000"));
        //aqui comensamos un nuevo chip manager con los espificasion del chip anterior y el layout que queremos usar
        ChipCloud drawableChipCloud = new ChipCloud(this, flexboxDrawable, drawableConfig);
        drawableChipCloud.addChip("Selecion 1");
        drawableChipCloud.addChip("Selecion 2");
        drawableChipCloud.addChip("Selecion 3");
        drawableChipCloud.addChip("Selecion 4");
    }

    public void thirdChips(){
        FlexboxLayout flexboxDrawable = (FlexboxLayout) findViewById(R.id.flexbox_3);
        ChipCloudConfig drawableConfig = new ChipCloudConfig()
                //selecion del tipo de chip que sea solamente 1
                .selectMode(ChipCloud.SelectMode.multi)
                //selecion del color del chip
                .checkedChipColor(Color.parseColor("#ddaa00"))
                //selecion del color del texto del chip
                .checkedTextColor(Color.parseColor("#ffffff"))
                //selecion del color del chip selecionado
                .uncheckedChipColor(Color.parseColor("#e0e0e0"))
                .showClose(Color.parseColor("#a6a6a6"))
                .useInsetPadding(false)
                .uncheckedTextColor(Color.parseColor("#000000"));
        //aqui comensamos un nuevo chip manager con los espificasion del chip anterior y el layout que queremos usar
        ChipCloud drawableChipCloud = new ChipCloud(this, flexboxDrawable, drawableConfig);
        drawableChipCloud.addChip("Anna A", ContextCompat.getDrawable(this, R.drawable.anna_b));
        drawableChipCloud.addChip("Anna B", ContextCompat.getDrawable(this, R.drawable.pic1));
        drawableChipCloud.addChip("Anna C", ContextCompat.getDrawable(this, R.drawable.pic2));
        drawableChipCloud.addChip("Anna D", ContextCompat.getDrawable(this, R.drawable.pic3));
        drawableChipCloud.addChip("Anna E", ContextCompat.getDrawable(this, R.drawable.anna_f));

        drawableChipCloud.setDeleteListener(new ChipDeletedListener() {
            @Override
            public void chipDeleted(int index, String label) {
                Toast toas = Toast.makeText(getBaseContext(),"Se a borrado el chip "+label,Toast.LENGTH_SHORT);
                toas.show();
            }
        });
    }










}
