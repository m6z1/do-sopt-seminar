package com.m6z1.week1

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.m6z1.week1.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {
    private var _binding: FragmentHomeBinding? = null
    private val binding: FragmentHomeBinding
        get() = requireNotNull(_binding)

    private val mockFriendList = listOf<FriendItemModel>(
        FriendItemModel(
            image = R.drawable.android_oreo,
            name = "안드 오레오",
            self_description = "오레오 버전의 안드로이드 입니당"
        ),
        FriendItemModel(
            image = R.drawable.android_pie,
            name = "안드 파이",
            self_description = "파이 버전의 안드로이드 입니당"
        ),
        FriendItemModel(
            image = R.drawable.cat,
            name = "고냥이",
            self_description = "야오야오야옹양옹"
        ),
        FriendItemModel(
            image = R.drawable.dog,
            name = "강아지",
            self_description = "멍멍멍멍멍멍"
        ),
        FriendItemModel(
            image = R.drawable.rabbit,
            name = "토끼",
            self_description = "깡총깡총깡총"
        )
    )

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val friendAdapter = FriendAdapter(requireContext())
        binding.rvHomeFriend.adapter = friendAdapter
        friendAdapter.setFriendList(mockFriendList)
        /*  var itemList = ArrayList<FriendItemModel>()

          itemList.add(FriendItemModel(R.drawable.android_pie,"안드 파이","파이 버전의 안드로이드 입니당"))
          itemList.add(FriendItemModel(R.drawable.android_pie,"안드 파이","파이 버전의 안드로이드 입니당"))*/

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }


}