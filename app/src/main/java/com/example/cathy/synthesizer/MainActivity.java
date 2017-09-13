package com.example.cathy.synthesizer;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.NumberPicker;

import static com.example.cathy.synthesizer.R.id.note_will_play;

public class MainActivity extends AppCompatActivity implements Button.OnClickListener {
    private static final int WHOLE_NOTE = 1000;
    private Button a, as, b, c, cs, d, ds, e, f, fs, g, gs, eToE, playPicked, twinkleStar, jingleBells;
    private MediaPlayer aNote, asNote, bNote, cNote, csNote, dNote, dsNote, eNote, fNote,
            fsNote, gNote, gsNote, highANote, highAsNote, highBNote, highCNote, highCsNote,
            highDNote, highDsNote, highENote, highFNote, highFsNote, highGNote, highGsNote;
    private NumberPicker timesWillPlay, noteWillPlay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        wirewidgets();
        setListeners();
        createMediaPlayers();

    }

    public void wirewidgets() {
        a = (Button) findViewById(R.id.button_a);
        as = (Button) findViewById(R.id.button_as);
        b = (Button) findViewById(R.id.button_b);
        c = (Button) findViewById(R.id.button_c);
        cs = (Button) findViewById(R.id.button_cs);
        d = (Button) findViewById(R.id.button_d);
        ds = (Button) findViewById(R.id.button_ds);
        e = (Button) findViewById(R.id.button_e);
        f = (Button) findViewById(R.id.button_f);
        fs = (Button) findViewById(R.id.button_fs);
        g = (Button) findViewById(R.id.button_g);
        gs = (Button) findViewById(R.id.button_gs);

        eToE = (Button) findViewById(R.id.e_to_e);


        timesWillPlay = (NumberPicker) findViewById(R.id.times_will_play);
        timesWillPlay.setMinValue(1);
        timesWillPlay.setMaxValue(10);
        noteWillPlay = (NumberPicker) findViewById(note_will_play);
        noteWillPlay.setMinValue(1);
        noteWillPlay.setMaxValue(12);
        noteWillPlay.setDisplayedValues(new String[]{"A", "A#", "B", "C", "C#", "D", "D#",
                "E", "F", "F#", "G", "G#"});
        playPicked = (Button) findViewById(R.id.play_picked);

        twinkleStar= (Button) findViewById(R.id.twinkle_star);

        jingleBells= (Button) findViewById(R.id.jingle_bells);

    }

    private void setListeners() {
        a.setOnClickListener(this);
        as.setOnClickListener(this);
        b.setOnClickListener(this);
        c.setOnClickListener(this);
        cs.setOnClickListener(this);
        d.setOnClickListener(this);
        ds.setOnClickListener(this);
        e.setOnClickListener(this);
        f.setOnClickListener(this);
        fs.setOnClickListener(this);
        g.setOnClickListener(this);
        gs.setOnClickListener(this);
        eToE.setOnClickListener(this);
        playPicked.setOnClickListener(this);
        twinkleStar.setOnClickListener(this);
        jingleBells.setOnClickListener(this);

    }

    private void createMediaPlayers() {
        aNote = MediaPlayer.create(this, R.raw.scalea);
        asNote = MediaPlayer.create(this, R.raw.scalebb);
        bNote = MediaPlayer.create(this, R.raw.scaleb);
        cNote = MediaPlayer.create(this, R.raw.scalec);
        csNote = MediaPlayer.create(this, R.raw.scalecs);
        dNote = MediaPlayer.create(this, R.raw.scaled);
        dsNote = MediaPlayer.create(this, R.raw.scaleds);
        eNote = MediaPlayer.create(this, R.raw.scalee);
        fNote = MediaPlayer.create(this, R.raw.scalef);
        fsNote = MediaPlayer.create(this, R.raw.scalefs);
        gNote = MediaPlayer.create(this, R.raw.scaleg);
        gsNote = MediaPlayer.create(this, R.raw.scalegs);
        highANote = MediaPlayer.create(this, R.raw.scalehigha);
        highAsNote = MediaPlayer.create(this, R.raw.scalehighbb);
        highBNote = MediaPlayer.create(this, R.raw.scalehighb);
        highCNote = MediaPlayer.create(this, R.raw.scalehighc);
        highCsNote = MediaPlayer.create(this, R.raw.scalehighcs);
        highDNote = MediaPlayer.create(this, R.raw.scalehighd);
        highDsNote = MediaPlayer.create(this, R.raw.scalehighds);
        highENote = MediaPlayer.create(this, R.raw.scalehighe);
        highFNote = MediaPlayer.create(this, R.raw.scalehighf);
        highFsNote = MediaPlayer.create(this, R.raw.scalehighfs);
        highGNote = MediaPlayer.create(this, R.raw.scalehighg);
        highGsNote = MediaPlayer.create(this, R.raw.scalehighgs);

    }

    private void delayPlaying(int delay) {
        try {
            Thread.sleep(delay);
        } catch (InterruptedException e) {
            Log.e("SynthesizerActivity", "Audio playback interrupted");
        }
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            //else if statements
            case R.id.button_a:
                aNote.seekTo(0);
                aNote.start();
                break;
            case R.id.button_as:
                asNote.seekTo(0);
                asNote.start();
                break;
            case R.id.button_b:
                bNote.seekTo(0);
                bNote.start();
                break;
            case R.id.button_c:
                cNote.seekTo(0);
                cNote.start();
                break;
            case R.id.button_cs:
                csNote.seekTo(0);
                csNote.start();
                break;
            case R.id.button_d:
                dNote.seekTo(0);
                dNote.start();
                break;
            case R.id.button_ds:
                dsNote.seekTo(0);
                dsNote.start();
                break;
            case R.id.button_e:
                eNote.seekTo(0);
                eNote.start();
                break;
            case R.id.button_f:
                fNote.seekTo(0);
                fNote.start();
                break;
            case R.id.button_fs:
                fsNote.seekTo(0);
                fsNote.start();
                break;
            case R.id.button_g:
                gNote.seekTo(0);
                gNote.start();
                break;
            case R.id.button_gs:
                gsNote.seekTo(0);
                gsNote.start();
                break;

            case R.id.e_to_e:
                MediaPlayer[] eScale = {eNote, fsNote, gNote, highANote, highBNote,
                        highCsNote, highDNote, highENote};
                for (int i = 0; i < 8; i++) {
                    eScale[i].seekTo(0);
                    eScale[i].start();
                    delayPlaying(WHOLE_NOTE / 2);
                }
                break;

            case R.id.play_picked:
                MediaPlayer[] entireScale = {aNote, asNote, bNote, cNote, csNote, dNote,
                        dsNote, eNote, fNote, fsNote, gNote, gsNote};

                for (int i = 0; i < timesWillPlay.getValue(); i++) {
                    //noteWillPlay.getValue()-1 because noteWillPlay goes from 1-12
                    entireScale[noteWillPlay.getValue() - 1].seekTo(0);
                    entireScale[noteWillPlay.getValue() - 1].start();
                    delayPlaying(WHOLE_NOTE / 2);
                }
                break;

            case R.id. twinkle_star:
                MediaPlayer[] twinkleSong = {aNote, aNote, highENote, highENote, highFsNote,
                        highFsNote, highENote,
                        dNote, dNote, csNote, csNote, bNote, bNote, aNote};
                for (int i = 0; i < 14; i++) {
                twinkleSong[i].seekTo(0);
                twinkleSong[i].start();
                delayPlaying(WHOLE_NOTE/2);
            }
            break;

            case R.id. jingle_bells:
                MediaPlayer[] jingleBells1 = {eNote, eNote, eNote, eNote, eNote, eNote, eNote,
                        gNote, cNote, dNote, eNote, fNote, fNote, fNote, fNote, fNote, eNote, eNote,
                        eNote, eNote, eNote, dNote, dNote, eNote, dNote, gNote,eNote, eNote,
                        eNote, eNote, eNote, eNote, eNote, gNote, cNote, dNote, eNote, fNote,
                        fNote, fNote, fNote, fNote, eNote, eNote, eNote, eNote, gNote, gNote, fNote,
                        dNote, cNote};
                int[] delayTimes = {500, 500, 1000, 500, 500, 1000, 500, 500, 750, 333, 1000, 500,
                        500, 500, 500, 500, 500, 500, 333, 500, 500, 500, 500, 500, 1000, 1000,
                        500, 500, 1000, 500, 500, 1000, 500, 500, 750, 333, 1000, 500,
                        500, 500, 500, 500, 500, 500, 333, 500};
                for (int i = 1; i < 47; i++)
                {
                        jingleBells1[i-1].seekTo(0);
                        jingleBells1[i-1].start();
                        delayPlaying(delayTimes[i-1]);
                }

                //
                        //, eNote, eNote, eNote,
                        //eNote, eNote, eNote, eNote,
                        //gNote, cNote, dNote, eNote, fNote, fNote, fNote, fNote, fNote, eNote, eNote,
                        //eNote, eNote, gNote, gNote, fNote, dNote, cNote};


                break;


            default:
                //else
        }
    }
}


