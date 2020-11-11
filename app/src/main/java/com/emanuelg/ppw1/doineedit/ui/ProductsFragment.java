package com.emanuelg.ppw1.doineedit.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.emanuelg.ppw1.doineedit.Product;
import com.emanuelg.ppw1.doineedit.R;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

public class ProductsFragment extends DialogFragment {
    public static ProductsFragment newInstance(String title) {
        ProductsFragment frag = new ProductsFragment();
        Bundle args = new Bundle();
        args.putString("title", title);
        frag.setArguments(args);
        return frag;
    }

  /*@NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        String title = getArguments().getString("title");
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(getActivity());
        alertDialogBuilder.setTitle(title);
        alertDialogBuilder.setMessage("Are you sure?");
        alertDialogBuilder.setPositiveButton("OK",  new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                // on success
            }
        });
        alertDialogBuilder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                if (dialog != null) {
                    dialog.dismiss();
                }
            }

        });

        return alertDialogBuilder.create();
    }
*/
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.dialog_fragment_add_product, container);

        TextView btn_add = root.findViewById(R.id.btn_add);
        TextView txtName = root.findViewById(R.id.edit_text_name);
        TextView txtPrice = root.findViewById(R.id.edit_text_price);
        btn_add.setOnClickListener(view -> {
            Product.list.add(new Product(txtName.getText().toString(),"size","color",txtPrice.getText().toString()));
            getDialog().dismiss();
        });
        return root;
    }
}
