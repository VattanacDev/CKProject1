package kh.com.vattanac.ckproject1;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Vattanac on 5/13/2017.
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    private List<ListItem>listItems;
    private Context context;

    public MyAdapter(List<ListItem> listItems, Context contex) {
        this.listItems = listItems;
        this.context = contex;
    }

    public MyAdapter(List<ListItem> listItems, MainActivity mainActivity) {


    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item,parent,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
         ListItem listItem=listItems.get(position);
         holder.textViewDetail.setText(listItem.getTitle());
         holder.textViewDetail.setText(listItem.getDetail());
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        public TextView textViewTitle;
        public  TextView textViewDetail;

        public ViewHolder(View itemView) {
            super(itemView);

            textViewTitle=(TextView)itemView.findViewById(R.id.txt_title);
            textViewDetail=(TextView)itemView.findViewById(R.id.txt_detail);
        }
    }
}
