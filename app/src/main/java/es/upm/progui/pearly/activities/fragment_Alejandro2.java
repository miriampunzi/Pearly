package es.upm.progui.pearly.activities;

import android.content.ClipData;
import android.content.ClipDescription;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
import android.view.DragEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import es.upm.progui.pearly.R;

public class fragment_Alejandro2 extends AppCompatActivity implements View.OnDragListener, View.OnLongClickListener {
    Context ctx;
    int unoFlag;
    //ImageView imgVw ;
    ImageView im1;
    ImageView im2;
    TextView turn;
    ClipData data;
    Button finishTurn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        System.out.println("***************MAIN ACTIVITY****************");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_alejandro2);
        //Find all views and set Tag to all draggable views
       /* TextView txtVw = (TextView) findViewById(R.id.lbl);
        txtVw.setTag("DRAGGABLE TEXTVIEW");
        txtVw.setOnLongClickListener(this);*/
       unoFlag = 0;
        Button draw = findViewById(R.id.button4);


        turn =(TextView)findViewById(R.id.textView2);

        im1 = (ImageView) findViewById(R.id.imageView3);
        im1.setTag("not");
        im2 = (ImageView) findViewById(R.id.imageView5);
        im2.setTag("correct");

        im1.setOnLongClickListener(this);

        //imgVw = (ImageView) findViewById(R.id.imageView);
        //imgVw.setTag("correct");


        //imgVw.setOnLongClickListener(this);
        im2.setOnLongClickListener(this);

        finishTurn = (Button) findViewById(R.id.button6);

        Button sayUno = (Button) findViewById(R.id.button5);

        draw.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v){

                Toast.makeText(fragment_Alejandro2.this, "There is no need to draw a card", Toast.LENGTH_LONG).show();




            }
        });

        sayUno.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v){
                if (unoFlag!=0){
                    Toast.makeText(fragment_Alejandro2.this, "UNO", Toast.LENGTH_LONG).show();
                }else{

                Toast.makeText(fragment_Alejandro2.this, "Are you sure you can say UNO?", Toast.LENGTH_SHORT).show();}




            }
        });

        /*Button btn = (Button) findViewById(R.id.btnDrag);
        btn.setTag("DRAGGABLE BUTTON");

        btn.setOnLongClickListener(this);*/
        //Set Drag Event Listeners for defined layouts
        findViewById(R.id.relativeLayout).setOnDragListener(this);
        //findViewById(R.id.layout2).setOnDragListener(this);
        //findViewById(R.id.layout50).setOnDragListener(this);
    }
    @Override
    public boolean onLongClick(View v) {
        // Create a new ClipData.Item from the ImageView object's tag
        ClipData.Item item = new ClipData.Item((CharSequence) v.getTag());
        // Create a new ClipData using the tag as a label, the plain text MIME type, and
        // the already-created item. This will create a new ClipDescription object within the
        // ClipData, and set its MIME type entry to "text/plain"
        String[] mimeTypes = {ClipDescription.MIMETYPE_TEXT_PLAIN};
        data = new ClipData(v.getTag().toString(), mimeTypes, item);
        // Instantiates the drag shadow builder.
        View.DragShadowBuilder dragshadow = new View.DragShadowBuilder(v);
        // Starts the drag
        v.startDrag(data        // data to be dragged
                , dragshadow   // drag shadow builder
                , v           // local data about the drag and drop operation
                , 0          // flags (not currently used, set to 0)
        );
        System.out.println("··········33333333333####DATA IS"+(data.getDescription().getLabel()).equals("correct"));

        if ((data.getDescription().getLabel()).equals("correct")){
            return true;
        }else {

            return false;
        }
    }
    // This is the method that the system calls when it dispatches a drag event to the listener.
    @Override
    public boolean onDrag(View v, DragEvent event) {
        // Defines a variable to store the action type for the incoming event
        int action = event.getAction();
        // Handles each of the expected events
        switch (action) {

            case DragEvent.ACTION_DRAG_STARTED:
                // Determines if this View can accept the dragged data
                //System.out.println("GETTING ID OF VIEW "+v.getId());

                //System.out.println("RESOURCE IS " +R.id.imageView);

                //ClipData.Item item = event.getClipData().getItemAt(0);
                // Gets the text data from the item.
                //String dragData = item.getText().toString();
                System.out.println("I AM IN DRAG START AND data is "+data.getDescription().getLabel());

                if (event.getClipDescription().hasMimeType(ClipDescription.MIMETYPE_TEXT_PLAIN)&& data.getDescription().getLabel().equals("correct")) {
                    // if you want to apply color when drag started to your view you can uncomment below lines
                    // to give any color tint to the View to indicate that it can accept data.
                    // v.getBackground().setColorFilter(Color.BLUE, PorterDuff.Mode.SRC_IN);
                    // Invalidate the view to force a redraw in the new tint
                    v.invalidate();
                    // returns true to indicate that the View can accept the dragged data.
                    return true;
                }
                // Returns false. During the current drag and drop operation, this View will
                // not receive events again until ACTION_DRAG_ENDED is sent.
                //findViewById(R.id.layout2).setOnDragListener(this);
                return false;

            case DragEvent.ACTION_DRAG_ENTERED:
                // Applies a GRAY or any color tint to the View. Return true; the return value is ignored.
//                v.getBackground().setColorFilter(Color.GRAY, PorterDuff.Mode.SRC_IN);
                // Invalidate the view to force a redraw in the new tint
                v.invalidate();
                return true;

            case DragEvent.ACTION_DRAG_LOCATION:
                // Ignore the event
                return true;

            case DragEvent.ACTION_DRAG_EXITED:
                // Re-sets the color tint to blue. Returns true; the return value is ignored.
                // view.getBackground().setColorFilter(Color.BLUE, PorterDuff.Mode.SRC_IN);
                //It will clear a color filter .
                //v.getBackground().clearColorFilter();
                // Invalidate the view to force a redraw in the new tint
                v.invalidate();
                return true;

            case DragEvent.ACTION_DROP:
                // Gets the item containing the dragged data
                //item = event.getClipData().getItemAt(0);
                // Gets the text data from the item.
                // dragData = item.getText().toString();
                // Displays a message containing the dragged data.
                //Toast.makeText(this, "Dragged data is " + dragData, Toast.LENGTH_SHORT).show();
                // Turns off any color tints
                // System.out.println("###############CLIP DATA IS ###############"+dragData);
//                v.getBackground().clearColorFilter();
                // Invalidates the view to force a redraw
                v.invalidate();

                View vw = (View) event.getLocalState();
                ViewGroup owner = (ViewGroup) vw.getParent();
                owner.removeView(vw); //remove the dragged view
                //caste the view into LinearLayout as our drag acceptable layout is LinearLayout
                ConstraintLayout container = (ConstraintLayout) v;
                container.addView(vw);//Add the dragged view
                vw.setVisibility(View.VISIBLE);//finally set Visibility to VISIBLE
                // Returns true. DragEvent.getResult() will return true.
                String ans = "correct";

                return true;

            case DragEvent.ACTION_DRAG_ENDED:
                // Turns off any color tinting
//                v.getBackground().clearColorFilter();
                // Invalidates the view to force a redraw
                v.invalidate();
                // Does a getResult(), and displays what happened.
                //System.out.println("########@@@@@@@RESULT OF drag"+event+"and "+R.id.imageView);
                if (event.getResult()) {
                    //System.out.println("******CLIP***********");
                   im2.setVisibility(View.INVISIBLE);
                   unoFlag +=1;
                    ImageView im = (ImageView) findViewById(R.id.imageView7);
                    //turn.setText("DARTH VADER'S TURN");
                    //SystemClock.sleep(1500);
                    im.setImageResource(R.drawable.uno_card_red2);


                    //Toast.makeText(this, "The drop was handled.", Toast.LENGTH_SHORT).show();
                    finishTurn.setVisibility(View.VISIBLE);

                    finishTurn.setOnClickListener(new View.OnClickListener(){
                        public void onClick(View v){

                            turn.setText("DARTH VADER'S TURN");
                            SystemClock.sleep(2000);
                            ImageView im = (ImageView) findViewById(R.id.imageView7);
                            im.setImageResource(R.drawable.uno_card_red5);

                            SystemClock.sleep(1000);
                            Intent openIntent = new Intent(fragment_Alejandro2.this, fragment_Alejandro3.class);
                            startActivity(openIntent);



                        }
                    });
                    //Intent openIntent = new Intent(getApplicationContext(), SecondActivity.class);
                    //startActivity(openIntent);
                    return true;
                }else{
                    Toast.makeText(this, "The drop didn't work.", Toast.LENGTH_SHORT).show();
                    // returns true; the value is ignored.
                    return false;
                }

                // An unknown action type was received.
            default:
                Log.e("DragDrop Example", "Unknown action type received by OnDragListener.");
                break;
        }
        return false;
    }
}