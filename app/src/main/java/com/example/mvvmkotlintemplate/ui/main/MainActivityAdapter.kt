package com.example.mvvmkotlintemplate.ui.main

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView

import com.example.mvvmkotlintemplate.databinding.ItemProductBinding

class MainActivityAdapter : ListAdapter<MainActivityViewState, MainActivityAdapter.ViewHolder>(DiffCallback) {
    var onItemClicked : (() -> Unit)? = null
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder = ViewHolder(
        ItemProductBinding.inflate(LayoutInflater.from(parent.context), parent, false)
    )

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(getItem(position), onItemClicked)
    }

    class ViewHolder(private val binding: ItemProductBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(item: MainActivityViewState, onItemClicked: (() -> Unit)?) {

        }
    }

    companion object {
        private val DiffCallback = object : DiffUtil.ItemCallback<MainActivityViewState>() {
            override fun areItemsTheSame(
                oldItem: MainActivityViewState,
                newItem: MainActivityViewState
            ): Boolean {
                return (oldItem == newItem)
            }

            @SuppressLint("DiffUtilEquals")
            override fun areContentsTheSame(
                oldItem: MainActivityViewState,
                newItem: MainActivityViewState
            ): Boolean {
                return oldItem == newItem
            }
        }
    }

//    override fun getItemViewType(p0: Int): Int {
//        TODO("Not yet implemented")
//    }
//
//    override fun getViewTypeCount(): Int {
//        TODO("Not yet implemented")
//    }

}