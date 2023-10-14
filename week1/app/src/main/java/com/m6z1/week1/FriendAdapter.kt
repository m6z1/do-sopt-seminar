package com.m6z1.week1

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.m6z1.week1.databinding.ItemFriendBinding

class FriendAdapter(context: Context) : RecyclerView.Adapter<FriendViewHolder>() {
    private val inflater by lazy { LayoutInflater.from(context) }

    private var friendList: List<FriendItemModel> = emptyList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FriendViewHolder {
        val binding = ItemFriendBinding.inflate(inflater, parent, false)
        return FriendViewHolder(binding)
    }

    override fun getItemCount() = friendList.size

    override fun onBindViewHolder(holder: FriendViewHolder, position: Int) {
        holder.onBind(friendList[position])
    }

    fun setFriendList(friendList: List<FriendItemModel>) {
        this.friendList = friendList.toList()
        notifyDataSetChanged()
    }
}