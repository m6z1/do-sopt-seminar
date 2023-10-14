package com.m6z1.week1

import androidx.recyclerview.widget.RecyclerView
import com.m6z1.week1.databinding.ItemFriendBinding

class FriendViewHolder(private val binding: ItemFriendBinding) :
    RecyclerView.ViewHolder(binding.root) {

    fun onBind(friendData: FriendItemModel) = with(binding) {
        ivProfile.setImageResource(friendData.image)
        tvHomeFriendName.text = friendData.name
        tvHomeDescription.text = friendData.self_description
    }
}