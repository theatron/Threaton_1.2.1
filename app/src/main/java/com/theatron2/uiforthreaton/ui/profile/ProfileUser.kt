package com.theatron2.uiforthreaton.ui.profile

import java.io.Serializable

data class ProfileUser(val name:String, val title:String, val url:String, val thumbnailphoto:String, val id:String, val desc:String,
                       var view:String, var likes:String, var dislikes:String, var shares:String, val photo:String, val vnum:String, val date:String, val time:String, val status:String=""):Serializable
{
    constructor():this("","","","","", "","0","0","0","0","","0","2020-05-14","06:00:18","")
}