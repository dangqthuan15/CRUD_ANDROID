package com.example.test_crud.Adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.test_crud.R;
import com.example.test_crud.them.them;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class TblopAdapter extends BaseAdapter {
    final ArrayList<them> tblopArrayList;

    public TblopAdapter(ArrayList<them> tblopArrayList) {
        this.tblopArrayList = tblopArrayList;
    }

    @Override
    public int getCount() {
        return tblopArrayList.size();
    }

    @Override
    public Object getItem(int i) {
        return tblopArrayList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return tblopArrayList.get(i).getId_lop();
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View itemView;
        if (view == null){
            itemView = View.inflate(viewGroup.getContext(), R.layout.custom_lv,null);


        }else
            itemView = view;
            them tblop = (them) tblopArrayList.get(i);
        TextView txtidlop = (TextView) itemView.findViewById(R.id.txt_idlop);
        TextView txttenlop = (TextView) itemView.findViewById(R.id.txt_tenlop);
        TextView txtnganh = (TextView) itemView.findViewById(R.id.txt_nganh);

        txtidlop.setText(tblop.getId_lop() +"");
        txttenlop.setText(tblop.getTen_lop());
        txtnganh.setText(tblop.getNganh());



        return itemView;
    }
}
