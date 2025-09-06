package com.example.demovmmv2.ui.user;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;

import com.example.demovmmv2.R;
import com.example.demovmmv2.data.model.UserModel;

public class UserAdapter extends ListAdapter<UserModel, UserAdapter.UserViewHolder> {

    // Constructor
    public UserAdapter() {
        super(DIFF_CALLBACK);
    }

    // DiffUtil giúp xác định item nào thay đổi
    private static final DiffUtil.ItemCallback<UserModel> DIFF_CALLBACK = new DiffUtil.ItemCallback<UserModel>() {
        @Override
        public boolean areItemsTheSame(@NonNull UserModel oldItem, @NonNull UserModel newItem) {
            // So sánh ID (duy nhất)
            return oldItem.getName() == newItem.getName();
        }

        @Override
        public boolean areContentsTheSame(@NonNull UserModel oldItem, @NonNull UserModel newItem) {
            // So sánh nội dung
            return oldItem.getName().equals(newItem.getName()) &&
                    oldItem.getEmail().equals(newItem.getEmail());
        }
    };

    @NonNull
    @Override
    public UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_user, parent, false);
        return new UserViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull UserViewHolder holder, int position) {
        UserModel user = getItem(position);
        holder.text1.setText(user.getName());
        holder.text2.setText(user.getEmail());
    }

    static class UserViewHolder extends RecyclerView.ViewHolder {
        TextView text1, text2;

        public UserViewHolder(@NonNull View itemView) {
            super(itemView);
            text1 = itemView.findViewById(R.id.tv_name);
            text2 = itemView.findViewById(R.id.tv_email);
        }
    }
}

