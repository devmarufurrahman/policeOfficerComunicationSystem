//package com.example.policecommunication;
//
//import androidx.annotation.NonNull;
//import androidx.annotation.Nullable;
//import androidx.appcompat.app.AppCompatActivity;
//
//import android.content.Context;
//import android.os.Bundle;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.AdapterView;
//import android.widget.ArrayAdapter;
//import android.widget.ImageView;
//import android.widget.ListView;
//import android.widget.TextView;
//import android.widget.Toast;
//
//import java.util.ArrayList;
//
//public class ViewUserActivity extends AppCompatActivity {
//    ListView listView;
//    ArrayList<listActivityModel> listActivityArr = new ArrayList<>();
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.view_user_activity);
//        // Id define
//        listView = findViewById(R.id.viewActivityList);
//
//        // set adapter
//        ListAdapter listAdapter = new ListAdapter(ViewUserActivity.this,listActivityArr);
//        listView.setAdapter(listAdapter);
//
//
//        // list item selection
////        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
////            @Override
////            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
////                for (int i = 0; i<=activityTitleArray.length;i++){
////                    if (position == i){
////                        Toast.makeText(ViewUserActivity.this, "list item " + i , Toast.LENGTH_SHORT).show();
////                    }
////                }
////            }
////        });
//    }
//
//
//    // adapter setup
//    class ListAdapter extends ArrayAdapter<String>{
//        Context context;
//        ArrayList<listActivityModel> listAdapterArr;
//
//
//       ListAdapter(Context context,ArrayList<listActivityModel> listAdapterArr){
//           super(context,R.layout.custom_list_activity,R.id.activityListTitle);
//           this.context = context;
//           this.listAdapterArr = listAdapterArr;
//
//       }
//
//        @NonNull
//        @Override
//        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
//            LayoutInflater layoutInflater = (LayoutInflater)getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
//            View activityList = layoutInflater.inflate(R.layout.custom_list_activity,parent,false);
//            ImageView userImg = activityList.findViewById(R.id.activityUserImg);
//            TextView activityTitle = activityList.findViewById(R.id.activityListTitle);
//            TextView activityDescription = activityList.findViewById(R.id.activityListDetails);
//            TextView locationActivity = activityList.findViewById(R.id.locationActivity);
//            TextView activityListUser = activityList.findViewById(R.id.activityList);
//
//
//            // set the list view data
//            userImg.setImageResource(userImage[position]);
//            activityTitle.setText(listTitle[position]);
//            activityDescription.setText(listDescription[position]);
//            locationActivity.setText(userLocation[position]);
//            activityListUser.setText(activity[position]);
//
//
//            return activityList;
//        }
//    }
//}