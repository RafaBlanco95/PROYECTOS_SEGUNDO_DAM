package com.example.androidapp1t;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class TwoPlayers extends Activity implements View.OnClickListener {
    int[] matrix= new int [9];
    ImageView one, two, three, four, five, six, seven, eight, nine;
    boolean player1Win, player2Win;
    int draws=0;
    int random=0;
    private static int me=0, you =0, tie=0;
    TextView scoreWin, scorePcWin, scoreTie;
    int player=1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two_players);
        one=findViewById(R.id.one);
        two=findViewById(R.id.two);
        three=findViewById(R.id.three);
        four=findViewById(R.id.four);
        five=findViewById(R.id.five);
        six=findViewById(R.id.six);
        seven=findViewById(R.id.seven);
        eight=findViewById(R.id.eight);
        nine=findViewById(R.id.nine);
        scoreWin=findViewById(R.id.scoreWin);
        scorePcWin=findViewById(R.id.scorePcWin);
        scoreTie=findViewById(R.id.scoreTie);
        for (int i=0;i<=8;i++){
            matrix[i]=0;
        }
        one.setOnClickListener(this);
        two.setOnClickListener(this);
        three.setOnClickListener(this);
        four.setOnClickListener(this);
        five.setOnClickListener(this);
        six.setOnClickListener(this);
        seven.setOnClickListener(this);
        eight.setOnClickListener(this);
        nine.setOnClickListener(this);
        delete();
        random=(int)(8*Math.random()+1);
        updateScores();
    }
    public void goBack(View view) {
        Intent anterior = new Intent(this, NewFunctionActivity.class);
        startActivity(anterior);
    }
    @Override
    public void onClick(View view) {
        boolean draw=false;
        switch(view.getId()){
            case R.id.one:
                if(matrix[0]==0 && player==1){
                    one.setImageResource(R.mipmap.circulo);
                    matrix[0]=1;
                    draw=true;
                }
                if(matrix[0]==0 && player==2){
                    one.setImageResource(R.mipmap.close);
                    matrix[0]=2;
                    draw=true;
                }
                break;
            case R.id.two:
                if(matrix[1]==0 && player==1){
                    two.setImageResource(R.mipmap.circulo);
                    matrix[1]=1;
                    draw=true;
                }
                if(matrix[1]==0 && player==2){
                    two.setImageResource(R.mipmap.close);
                    matrix[1]=2;
                    draw=true;
                }
                break;
            case R.id.three:
                if(matrix[2]==0 && player==1){
                    three.setImageResource(R.mipmap.circulo);
                    matrix[2]=1;
                    draw=true;
                }
                if(matrix[2]==0 && player==2){
                    three.setImageResource(R.mipmap.close);
                    matrix[2]=2;
                    draw=true;
                }
                break;
            case R.id.four:
                if(matrix[3]==0 && player==1){
                    four.setImageResource(R.mipmap.circulo);
                    matrix[3]=1;
                    draw=true;
                }
                if(matrix[3]==0 && player==2){
                    four.setImageResource(R.mipmap.close);
                    matrix[3]=2;
                    draw=true;
                }
                break;
            case R.id.five:
                if(matrix[4]==0 && player==1){
                    five.setImageResource(R.mipmap.circulo);
                    matrix[4]=1;
                    draw=true;
                }
                if(matrix[4]==0 && player==2){
                    five.setImageResource(R.mipmap.close);
                    matrix[4]=2;
                    draw=true;
                }
                break;
            case R.id.six:
                if(matrix[5]==0 && player==1){
                    six.setImageResource(R.mipmap.circulo);
                    matrix[5]=1;
                    draw=true;
                }
                if(matrix[5]==0 && player==2){
                    six.setImageResource(R.mipmap.close);
                    matrix[5]=2;
                    draw=true;
                }
                break;
            case R.id.seven:
                if(matrix[6]==0 && player==1){
                    seven.setImageResource(R.mipmap.circulo);
                    matrix[6]=1;
                    draw=true;
                }
                if(matrix[6]==0 && player==2){
                    seven.setImageResource(R.mipmap.close);
                    matrix[6]=2;
                    draw=true;
                }
                break;
            case R.id.eight:
                if(matrix[7]==0 && player==1){
                    eight.setImageResource(R.mipmap.circulo);
                    matrix[7]=1;
                    draw=true;
                }
                if(matrix[7]==0 && player==2){
                    eight.setImageResource(R.mipmap.close);
                    matrix[7]=2;
                    draw=true;
                }
                break;
            case R.id.nine:
                if(matrix[8]==0 && player==1){
                    nine.setImageResource(R.mipmap.circulo);
                    matrix[8]=1;
                    draw=true;
                }
                if(matrix[8]==0 && player==2){
                    nine.setImageResource(R.mipmap.close);
                    matrix[8]=2;
                    draw=true;
                }
                break;
        }
        if(draw){
            if(player==1 ){
                player=2;
            }else{
                player=1;
            }
            draws++;
            whoWins();
            check();
        }
    }
    public void delete(){
        one.setImageResource(R.mipmap.background);
        two.setImageResource(R.mipmap.background);
        three.setImageResource(R.mipmap.background);
        four.setImageResource(R.mipmap.background);
        five.setImageResource(R.mipmap.background);
        six.setImageResource(R.mipmap.background);
        seven.setImageResource(R.mipmap.background);
        eight.setImageResource(R.mipmap.background);
        nine.setImageResource(R.mipmap.background);
        for (int i=0;i<=8;i++){
            matrix[i]=0;
        }
        player1Win =false;
        player2Win =false;
        draws=0;
        random=(int)(8*Math.random()+1);
    }

    public void updateScores(){
        scoreWin.setText("");
        scorePcWin.setText("");
        scoreTie.setText("");
        scoreWin.setText(String.valueOf(me));
        scorePcWin.setText(String.valueOf(you));
        scoreTie.setText(String.valueOf(tie));

    }
    public void check(){
        if (player1Win){
            Toast toast=Toast.makeText(this,"¡Ha ganado el jugador 1!",Toast.LENGTH_LONG);
            toast.show();
            me++;
            restart(this);
        }
        if (player2Win){
            Toast toast=Toast.makeText(this,"¡Ha ganado el jugador 2!",Toast.LENGTH_LONG);
            toast.show();
            you++;
            restart(this);
        }
        if (draws==9 && !player1Win && !player2Win){
            Toast toast=Toast.makeText(this,"¡Empate!",Toast.LENGTH_LONG);
            toast.show();
            tie++;
            restart(this);
        }
    }
    public static void restart(Activity activity){
        Intent intent= new Intent();
        intent.setClass(activity,activity.getClass());
        activity.startActivity(intent);
        activity.finish();
    }
    public void whoWins(){

        //you Win
        if(matrix[0]==1 && matrix[1]==1 && matrix[2]==1){
            player1Win=true;
        }
        if(matrix[3]==1 && matrix[4]==1 && matrix[5]==1){
            player1Win=true;
        }
        if(matrix[6]==1 && matrix[7]==1 && matrix[8]==1){
            player1Win=true;
        }
        if(matrix[0]==1 && matrix[3]==1 && matrix[6]==1){
            player1Win=true;
        }
        if(matrix[1]==1 && matrix[4]==1 && matrix[7]==1){
            player1Win=true;
        }
        if(matrix[2]==1 && matrix[5]==1 && matrix[8]==1){
            player1Win=true;
        }
        if(matrix[0]==1 && matrix[4]==1 && matrix[8]==1){
            player1Win=true;
        }
        if(matrix[2]==1 && matrix[4]==1 && matrix[6]==1){
            player1Win=true;
        }

        // pc Wins

        if(matrix[0]==2 && matrix[1]==2 && matrix[2]==2){
            player2Win=true;
        }
        if(matrix[3]==2 && matrix[4]==2 && matrix[5]==2){
            player2Win=true;
        }
        if(matrix[6]==2 && matrix[7]==2 && matrix[8]==2){
            player2Win=true;
        }
        if(matrix[0]==2 && matrix[3]==2 && matrix[6]==2){
            player2Win=true;
        }
        if(matrix[1]==2 && matrix[4]==2 && matrix[7]==2){
            player2Win=true;
        }
        if(matrix[2]==2 && matrix[5]==2 && matrix[8]==2){
            player2Win=true;
        }
        if(matrix[0]==2 && matrix[4]==2 && matrix[8]==2){
            player2Win=true;
        }
        if(matrix[2]==2 && matrix[4]==2 && matrix[6]==2){
            player2Win=true;
        }
    }
}