package com.l3git.armyrankstest

object Constants {

    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun getQuestions(): ArrayList<Question>{
        val questionsList = ArrayList<Question>()

        val que1 = Question(1,"What rank is this?",
            R.drawable.e2privatesecondclass,
            "Private First Class",
            "Private",
            "Private Second Class",
            "Specialist",
            3
        )
        questionsList.add(que1)

        val que2 = Question(
            2,"What rank is this?",R.drawable.e3privatefirstclass,
            "Private",
            "Private First Class",
            "Colonel",
            "Specialist",
            2
        )
        questionsList.add(que2)

        val que3 = Question(
            3,"What rank is this?",R.drawable.e4corporal,
            "Sergeant Major",
            "Private",
            "Sergeant",
            "Corporal",
            4
        )
        questionsList.add(que3)

        val que4 = Question(
            4,"What rank is this?",R.drawable.e4specialist,
            "Private",
            "Corporal",
            "Specialist",
            "Sergeant",
            3
        )
        questionsList.add(que4)

        val que5 = Question(
            5,"What rank is this?",R.drawable.e5sergeant,
            "Staff Sergeant",
            "Private Second Class",
            "Sergeant First Class",
            "Sergeant",
            4
        )
        questionsList.add(que5)

        val que6 = Question(
            6,"What rank is this?",R.drawable.e6staffsergeant,
            "Staff Sergeant",
            "Sergeant",
            "First Sergeant",
            "Corporal",
            1
        )
        questionsList.add(que6)

        val que7 = Question(
            7,"What rank is this?",R.drawable.e7sergeantfirstclass,
            "Master Sergeant",
            "Sergeant First Class",
            "First Sergeant",
            "Command Sergeant Major",
            2
        )
        questionsList.add(que7)

        val que8 = Question(
            8,"What rank is this?",R.drawable.e8mastersergeant,
            "Master Sergeant",
            "Sergeant Major",
            "Sergeant Major of the Army",
            "Staff Sergeant",
            1
        )
        questionsList.add(que8)

        val que9 = Question(
            9,"What rank is this?",R.drawable.e8bfirstsergeant,
            "Sergeant First Class",
            "Specialist",
            "Command Sergeant",
            "First Sergeant",
            4
        )
        questionsList.add(que9)

        val que10 = Question(
            10,"What rank is this?",R.drawable.e9sergeantmajor,
            "Command Sergeant Major",
            "Master Sergeant",
            "Sergeant Major",
            "Sergeant Major of the Army",
            3
        )
        questionsList.add(que10)

        val que11 = Question(
            11,"What rank is this?",R.drawable.e9bcommandsergeantmajor,
            "Command Sergeant Major",
            "Master Sergeant",
            "Sergeant",
            "Corporal",
            1
        )
        questionsList.add(que11)

        val que12 = Question(
            12,"What rank is this?",R.drawable.e9csergeantmajorofthearmy,
            "Master Sergeant",
            "Command Sergeant Major",
            "Sergeant Major",
            "Sergeant Major of the Army",
            4
        )
        questionsList.add(que12)

        val que13 = Question(
            13,"What rank is this?",R.drawable.w1warrantofficer1,
            "Warrant Officer 1",
            "Chief Warrant Officer 2",
            "Second Lieutenant",
            "First Lieutenant",
            1
        )
        questionsList.add(que13)

        val que14 = Question(
            14,"What rank is this?",R.drawable.w2chiefwarrantofficer2,
            "Lieutenant Colonel",
            "Chief Warrant Officer 2",
            "First Lieutenant",
            "Colonel",
            2
        )
        questionsList.add(que14)

        val que15 = Question(
            15,"What rank is this?",R.drawable.w3chiefwarrantofficer3,
            "Chief Warrant Officer 4",
            "First Lieutenant",
            "Warrant Officer 1",
            "Chief Warrant Officer 3",
            4
        )
        questionsList.add(que15)

        val que16 = Question(
            16,"What rank is this?",R.drawable.w4chiefwarrantofficer4,
            "Chief Warrant Officer 4",
            "Specialist",
            "Chief Warrant Officer 5",
            "Second Lieutenant",
            1
        )
        questionsList.add(que16)

        val que17 = Question(
            17,"What rank is this?",R.drawable.w5chiefwarrantofficer5,
            "Major",
            "Specialist",
            "Chief Warrant Officer 5",
            "Second Lieutenant",
            3
        )
        questionsList.add(que17)

        val que18 = Question(
            18,"What rank is this?",R.drawable.o1secondlieutenant,
            "Captain",
            "Second Lieutenant",
            "First Lieutenant",
            "Lieutenant Colonel",
            2
        )
        questionsList.add(que18)

        val que19 = Question(
            19,"What rank is this?",R.drawable.o2firstlieutenant,
            "First Lieutenant",
            "Lieutenant Colonel",
            "Lieutenant General",
            "Major",
            1
        )
        questionsList.add(que19)

        val que20 = Question(
            20,"What rank is this?",R.drawable.o3captain,
            "Major",
            "Colonel",
            "Captain",
            "General",
            3
        )
        questionsList.add(que20)

        val que21 = Question(
            21,"What rank is this?",R.drawable.o4major,
            "Major",
            "Second Lieutenant",
            "Chief Warrant Officer 5",
            "Command Sergeant Major",
            1
        )
        questionsList.add(que21)

        val que22 = Question(
            22,"What rank is this?",R.drawable.o5lieutenantcolonel,
            "First Lieutenant",
            "Lieutenant Colonel",
            "Major",
            "Lieutenant General",
            2
        )
        questionsList.add(que22)

        val que23 = Question(
            23,"What rank is this?",R.drawable.o6colonel,
            "Lieutenant Colonel",
            "Chief Warrant Officer 5",
            "Brigadier General",
            "Colonel",
            4
        )
        questionsList.add(que23)

        val que24 = Question(
            24,"What rank is this?",R.drawable.o7brigadiergeneral,
            "Brigadier General",
            "Major General",
            "Major",
            "Second Lieutenant",
            1
        )
        questionsList.add(que24)

        val que25 = Question(
            25,"What rank is this?",R.drawable.o8majorgeneral,
            "General",
            "Major General",
            "Specialist",
            "Colonel",
            2
        )
        questionsList.add(que25)

        val que26 = Question(
            26,"What rank is this?",R.drawable.o9lieutenantgeneral,
            "Lieutenant General",
            "General of the Army",
            "Captain",
            "Sergeant Major of the Army",
            1
        )
        questionsList.add(que26)

        val que27 = Question(
            27,"What rank is this?",R.drawable.o10general,
            "Lieutenant GeneralGeneral",
            "Lieutenant Colonel",
            "Brigadier General",
            "General",
            4
        )
        questionsList.add(que27)

        val que28 = Question(
            28,"What rank is this?",R.drawable.o11generalofthearmy,
            "Major General",
            "General",
            "General of the Army",
            "Brigadier General",
            3
        )
        questionsList.add(que28)

        return  questionsList


    }



    fun getFacts(): ArrayList<Fact>{
        val factList = ArrayList<Fact>()

        val fac1 = Fact(1,"General of the Army George C. Marshall was Chief of Staff of the Army for 6 years and 78 days, which is the longest serving Chief of Staff of the Army.")
        factList.add(fac1)

        val fac2 = Fact(2,"The current Chief of Staff of the Army is General James C. McConville.")
        factList.add(fac2)

        val fac3 = Fact(3,"Afghanistan is the longest war in American history. Previously, Vietnam was the longest conflict.")
        factList.add(fac3)

        val fac4 = Fact(4,"General of the Army. This rank is only used during the time of war. The last officer holding this rank was Gen. Bradley, in 1950.")
        factList.add(fac4)

        val fac5 = Fact(5,"The Army is older than the Nation, with its roots in the Continental Army.")
        factList.add(fac5)

        val fac6 = Fact(6,"The Air Force was part of the Army until 1946.")
        factList.add(fac6)

        val fac7 = Fact(7,"A US Army Air Corps Colonel was the driving force behind the creation of Ray-Bans.")
        factList.add(fac7)

        val fac8 = Fact(8,"The Draft was created during WW I to increase the Army's size.")
        factList.add(fac8)

        val fac9 = Fact(9,"32 Presidents have served in the military in some capacity.")
        factList.add(fac9)

        val fac10 = Fact(10,"George Washington chose the Army's dress colors.")
        factList.add(fac10)

        val fac11 = Fact(11,"The United States Army as we know it today was founded June 14, 1775.")
        factList.add(fac11)

        val fac12 = Fact(12,"Galusha Pennypacker is widely recognized as the youngest general in Army history, earning a promotion to brevet brigadier general at the age of 20 during the Civil War.")
        factList.add(fac12)

        val fac13 = Fact(13,"The 3rd U.S. Infantry, traditionally known as \"The Old Guard,\" is the oldest active-duty infantry unit in the Army, serving our nation since 1784.")
        factList.add(fac13)

        val fac14 = Fact(14,"Use the GI Bill program to help pay for college!")
        factList.add(fac14)

        val fac15 = Fact(15,"Sign up as soon as you can for a Military Bank or Credit Union for best financial options.")
        factList.add(fac15)

//        val fac16 = Fact(16,"Reveille is played at the start of the work day, Retreat is played at the close of work, and Taps is played to mark quiet hours. Times may vary depending on the base.")
//        factList.add(fac16)

        val fac17 = Fact(16,"The three company level officer ranks are 2nd Lieutenant, 1st Lieutenant, and Captain.")
        factList.add(fac17)

        val fac18 = Fact(17,"The first four enlisted ranks range from Private, E-1 to Specialist, E-4.")
        factList.add(fac18)

        val fac19 = Fact(18,"Corporals through Staff Sergeants are all Junior Non-Commissioned Officers or NCOs")
        factList.add(fac19)

        val fac20 = Fact(19,"Sergeant First Class through Sergeant Major of the Army are all Senior NCOs")
        factList.add(fac20)

        val fac21 = Fact(20,"Never go \"over the heads\" of superiors. Don’t jump the chain of command.")
        factList.add(fac21)

        val fac22 = Fact(21,"If you don’t know the answer to a superior’s question, you will never go wrong with the response, \"I don’t know Sir or Drill Sergeant, but I’ll find out.\"")
        factList.add(fac22)

        val fac23 = Fact(22,"Never turn and walk away to avoid giving a hand salute.")
        factList.add(fac23)

        val fac24 = Fact(23,"When you are dismissed by an officer, or when they depart, come to attention and salute.")
        factList.add(fac24)

        val fac25 = Fact(24,"When an NCO of superior rank enters the room, the first Warrior to recognize the NCO calls the room to \"At ease\"")
        factList.add(fac25)

        val fac26 = Fact(25,"Brigadier General Anna Mae Violet Hays was the first woman in the United States Armed Forces to be promoted to the rank of General.")
        factList.add(fac26)




        return factList
    }

}