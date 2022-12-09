package com.example.nextpotify;

import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.os.Bundle;
import android.os.Environment;
import android.provider.ContactsContract;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.karumi.dexter.Dexter;
import com.karumi.dexter.PermissionToken;
import com.karumi.dexter.listener.PermissionDeniedResponse;
import com.karumi.dexter.listener.PermissionGrantedResponse;
import com.karumi.dexter.listener.PermissionRequest;
import com.karumi.dexter.listener.single.PermissionListener;

import java.io.File;
import java.util.ArrayList;

public class SongsListActivity extends AppCompatActivity {
    ListView listView;
   // String[] items;
    private final String[] items= {"El misterio de las tortugas", "Princesas", "Natural"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_songs_list);
        listView=findViewById(R.id.listViewSong);
        //runtimePermission();
        displaySongs();

    }
    /*
    public void runtimePermission(){
        Dexter.withContext(this).withPermission(Manifest.permission.READ_EXTERNAL_STORAGE)
                .withListener(new PermissionListener() {
                    @Override
                    public void onPermissionGranted(PermissionGrantedResponse permissionGrantedResponse) {
                        displaySongs();
                    }

                    @Override
                    public void onPermissionDenied(PermissionDeniedResponse permissionDeniedResponse) {

                    }

                    @Override
                    public void onPermissionRationaleShouldBeShown(PermissionRequest permissionRequest, PermissionToken permissionToken) {
                        permissionToken.continuePermissionRequest();
                    }
                }).check();
    }*/

    public ArrayList<File> findSong (File file){
        ArrayList<File> arrayList= new ArrayList<>();

        File[] files= file.listFiles();

        for (File singleFile:files){
            if(singleFile.isDirectory() && !singleFile.isHidden()){
                arrayList.addAll(findSong(singleFile));
            }else{
                if(singleFile.getName().endsWith(".mp3") || singleFile.getName().endsWith(".wav"))
                {
                    arrayList.add(singleFile);
                }
            }
        }
        return arrayList;
    }

    public void displaySongs(){
       // File raw= new File("/Users/rafaelblancoaranda/AndroidStudioProjects/Nextpotify/app/src/main/res/raw/song2.mp3");
      // boolean rawBoolean=raw.exists();


        //final ArrayList<File> mySongs = findSong(raw);
/*
        items= new String [mySongs.size()];

        for( int i=0; i< mySongs.size();i++){
            items[i]=mySongs.get(i).getName().toString().replace(".mp3", "").replace(".wav", "");

        }
        */
        //items=new String [mySongs.size()];
        //items[0]="El misterio de las tortugas";
        //items[1]="Princesas";
       // items[2]="Natural";

            ArrayAdapter<String> myAdapter = new ArrayAdapter<>(this,R.layout.list_item_song,items);
            listView.setAdapter(myAdapter);


        /*
        customAdapter customAdapter= new customAdapter();
        listView.setAdapter(customAdapter);*/
    }

/*
    class customAdapter extends BaseAdapter{

        @Override
        public int getCount() {
            return items.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            View myView = getLayoutInflater().inflate(R.layout.list_item, null);
            TextView textsong =myView.findViewById(R.id.txtsongname);
            textsong.setSelected(true);
            textsong.setText(items[i]);

            return myView;
        }
    }*/
}