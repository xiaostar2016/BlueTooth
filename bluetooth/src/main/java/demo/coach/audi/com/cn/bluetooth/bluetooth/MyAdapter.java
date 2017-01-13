package demo.coach.audi.com.cn.bluetooth.bluetooth;

import android.bluetooth.BluetoothDevice;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by ZD_xiao on 2017/1/12.
 */
public class MyAdapter extends BaseAdapter {


    private ArrayList<BluetoothDevice> deviceList;
    private TextView textView;

    public MyAdapter(ArrayList<BluetoothDevice> deviceList) {
        this.deviceList = deviceList;
    }

    @Override
    public int getCount() {
        return deviceList.size();
    }

    @Override
    public BluetoothDevice getItem(int position) {
        return deviceList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView == null) {
            textView = new TextView(parent.getContext());
            textView.setTextSize(22);

        } else {
            textView = (TextView) convertView;
        }
        String name = getItem(position).getName();
        textView.setText(name);

        return textView;
    }

}
