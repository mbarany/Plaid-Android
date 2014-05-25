package com.michaelbarany.plaid;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.michaelbarany.plaid.api.Formatter;
import com.michaelbarany.plaid.api.models.Transaction;

public class TransactionsAdapter extends ArrayAdapter<Transaction> {
    private static final int LAYOUT_RESOURCE = R.layout.fragment_transaction_item;

    public TransactionsAdapter(Context context) {
        super(context, LAYOUT_RESOURCE);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        if (null == convertView) {
            LayoutInflater inflater = LayoutInflater.from(parent.getContext());
            convertView = inflater.inflate(LAYOUT_RESOURCE, parent, false);

            viewHolder = new ViewHolder();
            viewHolder.description = (TextView) convertView.findViewById(R.id.description);
            viewHolder.amount = (TextView) convertView.findViewById(R.id.amount);
            viewHolder.date = (TextView) convertView.findViewById(R.id.date);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        Transaction item = getItem(position);
        viewHolder.description.setText(item.getName());
        viewHolder.amount.setText(Formatter.toCurrency(item.getAmount()));
        viewHolder.date.setText(Formatter.convertDate(item.getDate(), "yyyy-mm-dd", "mm/dd/yyyy"));

        return convertView;
    }

    private static class ViewHolder {
        private TextView description;
        private TextView amount;
        private TextView date;
    }
}
