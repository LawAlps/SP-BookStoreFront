package com.example.bookstore;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

import maes.tech.intentanim.CustomIntent;

public class MainActivity extends AppCompatActivity {
    BookDetailsClass firstBook, secondBook, thirdBook, fourthBook, fifthBook, sixthBook, seventhBook, eightBook, ninthBook, tenthBook;
    ViewHolder viewHolder;

    class ViewHolder {
        CardView fantasyCardView, horrorCardView, dramaCardView;
    }

    private void initalizeViews() {
        viewHolder.fantasyCardView = findViewById(R.id.card_view_fantasy_category);
        viewHolder.horrorCardView = findViewById(R.id.card_view_horror_category);
        viewHolder.dramaCardView = findViewById(R.id.card_view_drama_category);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewHolder = new ViewHolder();
        initalizeViews();

        viewHolder.fantasyCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (getBaseContext(), ListActivity.class);
                firstBook = new BookDetailsClass("Rise of the North", "Set in a fantastical world of sword, magic, and dragons, our protagonist Jon finds himself in the middle of a politcal power struggle.\n\nThough he tries his damndest to stay out it, his blood makes him the legitimate emperor of the four kingdoms. He has to make a sharp decision, leave behind his wistful, quiet life to be forced into kingship, or try and go against the waves. Read the political intrigue and sabotage.", "H.T.T Bartin", "PL Books");
                secondBook = new BookDetailsClass("Rejecting the Titans", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.\n\nUt enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.", "Sara Badall", "Dice Books");
                thirdBook = new BookDetailsClass("Silver Persuer", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.\n\nUt enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.", "Raimy John", "TRR Books");
                fourthBook = new BookDetailsClass("Curse of Demons", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.\n\nUt enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.", "Beverly Steepe", "C. Books");
                fifthBook = new BookDetailsClass("Chamber of The Kings", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.\n\nUt enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.", "Count G.", "DtD Lim.");
                sixthBook = new BookDetailsClass("King of Whispers", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.\n\nUt enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.", "Pale Pete", "Terin Books");
                seventhBook = new BookDetailsClass("A Ballad of Death And Misery", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.\n\nUt enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.", "Rodel H.", "GD Books");
                eightBook = new BookDetailsClass("Magic of Ice", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.\n\nUt enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.", "R.R Bolkien", "AP Books");
                ninthBook = new BookDetailsClass("Guardians of the Skull", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.\n\nUt enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.", "Bushiv A.", "GD Books");
                tenthBook = new BookDetailsClass("Answering to the Dark", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.\n\nUt enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.", "D. Aimes", "Well Books");

                intent.putExtra("Genre", "fantasy");
                intent.putExtra("1st Book", firstBook);
                intent.putExtra("2nd Book", secondBook);
                intent.putExtra("3rd Book", thirdBook);
                intent.putExtra("4th Book", fourthBook);
                intent.putExtra("5th Book", fifthBook);
                intent.putExtra("6th Book", sixthBook);
                intent.putExtra("7th Book", seventhBook);
                intent.putExtra("8th Book", eightBook);
                intent.putExtra("9th Book", ninthBook);
                intent.putExtra("10th Book", tenthBook);

                startActivity(intent);
                //All custom libraries/amimations in 'References.txt'
                CustomIntent.customType(MainActivity.this, "fadein-to-fadeout");;
            }
        });

        viewHolder.horrorCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (getBaseContext(), ListActivity.class);
                firstBook = new BookDetailsClass("The Smiling Spirit", "Whilst investigating the death of a local homemaker, an unassuming painter called Beverly Sunderland uncovers a legend about a supernaturally-cursed, warped coin circulating throughout Cornwall.\n\nAs soon as one gets ahold of the coin, he or she has exactly 28 days left to live. The doomed few appear to be ordinary people during day to day life, but when photographed, they look translucent. A marked person feels like a hazy mist to touch.", "Depon James", "RR Books");
                secondBook = new BookDetailsClass("Girls in the Fog", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.\n\nUt enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.", "Pitacus Lair", "OL Books");
                thirdBook = new BookDetailsClass("Wanted By Hell", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.\n\nUt enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.", "T. R. Martin", "GD Books");
                fourthBook = new BookDetailsClass("Creatures In Dreams", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.\n\nUt enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.", "Lon Moore", "GL Books");
                fifthBook = new BookDetailsClass("Working at the Tombs", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.\n\nUt enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.", "I. Koffalott", "Bor Books");
                sixthBook = new BookDetailsClass("Don't Blink", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.\n\nUt enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.", "Neil Downe", "SW Books");
                seventhBook = new BookDetailsClass("Weeping at the Tombs", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.\n\nUt enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.", "E. Nuff", "NW Books");
                eightBook = new BookDetailsClass("Man Of Hell", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.\n\nUt enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.", "T. R. Martin", "GD Books");
                ninthBook = new BookDetailsClass("Rattle of the Night", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.\n\nUt enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.", "Justin Case", "TR Books");
                tenthBook = new BookDetailsClass("Grinning Shadows", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.\n\nUt enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.", "Blaire Gomes", "Def Library");

                intent.putExtra("Genre", "horror");
                intent.putExtra("1st Book", firstBook);
                intent.putExtra("2nd Book", secondBook);
                intent.putExtra("3rd Book", thirdBook);
                intent.putExtra("4th Book", fourthBook);
                intent.putExtra("5th Book", fifthBook);
                intent.putExtra("6th Book", sixthBook);
                intent.putExtra("7th Book", seventhBook);
                intent.putExtra("8th Book", eightBook);
                intent.putExtra("9th Book", ninthBook);
                intent.putExtra("10th Book", tenthBook);

                startActivity(intent);
                CustomIntent.customType(MainActivity.this, "fadein-to-fadeout");;
            }
        });

        viewHolder.dramaCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (getBaseContext(), ListActivity.class);
                firstBook = new BookDetailsClass("Beneath a Moonlit Sky", "Sharon Degeneres had not known love or loss until she risked loosing her beloved mother Helen Degeneres.\n\nHer happy life is shattered when her single mother was abruptly diagnosed with cancer. Sharon will now have to juggle her responsibilities and taking care of her mother at a tender young age.", "Amelia Lover", "TM Books");
                secondBook = new BookDetailsClass("The Misty Doors", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.\n\nUt enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.", "J.P. Morgan", "FW Books");
                thirdBook = new BookDetailsClass("Prized Stars", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.\n\nUt enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.", "Delores Q.", "Pub. Books");
                fourthBook = new BookDetailsClass("The Falling Dreamer", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.\n\nUt enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.", "Sunderson", "Dept. Books");
                fifthBook = new BookDetailsClass("Forgotten Twins", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.\n\nUt enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.", "Agassi T.", "D.D. Books");
                sixthBook = new BookDetailsClass("Silent Night", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.\n\nUt enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.", "Bryan Hems", "TM Books");
                seventhBook = new BookDetailsClass("The Purple Door", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.\n\nUt enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.", "Carlison G", "GD Books");
                eightBook = new BookDetailsClass("Missing Words", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.\n\nUt enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.", "T. R.", "P.R. Books");
                ninthBook = new BookDetailsClass("The Dwindling Nothing", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.\n\nUt enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.", "Chris Plato", "D.M. Books");
                tenthBook = new BookDetailsClass("Slivers of Memory", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.\n\nUt enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.", "D.T. Flow", "WW BT");

                intent.putExtra("Genre", "drama");
                intent.putExtra("1st Book", firstBook);
                intent.putExtra("2nd Book", secondBook);
                intent.putExtra("3rd Book", thirdBook);
                intent.putExtra("4th Book", fourthBook);
                intent.putExtra("5th Book", fifthBook);
                intent.putExtra("6th Book", sixthBook);
                intent.putExtra("7th Book", seventhBook);
                intent.putExtra("8th Book", eightBook);
                intent.putExtra("9th Book", ninthBook);
                intent.putExtra("10th Book", tenthBook);

                startActivity(intent);
                CustomIntent.customType(MainActivity.this, "fadein-to-fadeout");
            }
        });


    }

}
