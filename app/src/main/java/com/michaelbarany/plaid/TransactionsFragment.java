package com.michaelbarany.plaid;

import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;

import com.michaelbarany.plaid.api.Api;
import com.michaelbarany.plaid.api.Service;
import com.michaelbarany.plaid.api.models.BankAccount;

import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;

/**
 * A fragment representing a list of Items.
 * <p />
 * Large screen devices (such as tablets) are supported by replacing the ListView
 * with a GridView.
 * <p />
 */
public class TransactionsFragment extends Fragment implements AbsListView.OnItemClickListener {

    private static final String ARG_ACCOUNT_ID = "account_id";
    private int mAccountId;

    /**
     * The fragment's ListView/GridView.
     */
    private AbsListView mListView;

    /**
     * The Adapter which will be used to populate the ListView/GridView with
     * Views.
     */
    private ArrayAdapter mAdapter;

    public static TransactionsFragment newInstance(int param1) {
        TransactionsFragment fragment = new TransactionsFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_ACCOUNT_ID, param1);
        fragment.setArguments(args);
        return fragment;
    }

    /**
     * Mandatory empty constructor for the fragment manager to instantiate the
     * fragment (e.g. upon screen orientation changes).
     */
    public TransactionsFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getArguments() != null) {
            mAccountId = getArguments().getInt(ARG_ACCOUNT_ID);
        }

        mAdapter = new TransactionsAdapter(
            getActivity()
        );

        Api.getInstance().getService(Service.class).account(mAccountId, new Callback<BankAccount>() {
            @Override
            public void success(BankAccount bankAccount, Response response) {
                //ToDo: Handle multiple accounts
                mAdapter.addAll(bankAccount.getAccounts().get(0).getTransactions());
            }

            @Override
            public void failure(RetrofitError error) {
                Log.d("PLAID", "API Failure!!!");
                error.printStackTrace();
            }
        });
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_transaction, container, false);

        // Set the adapter
        mListView = (AbsListView) view.findViewById(android.R.id.list);
        mListView.setAdapter(mAdapter);

        // Set OnItemClickListener so we can be notified on item clicks
        mListView.setOnItemClickListener(this);

        return view;
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
    }
}
