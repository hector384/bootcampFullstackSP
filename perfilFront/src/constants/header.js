import React from "react";

const my_image = "https://scontent-bog1-1.xx.fbcdn.net/v/t1.6435-9/149286046_10222631534411405_4537370222683655114_n.jpg?_nc_cat=104&ccb=1-7&_nc_sid=174925&_nc_eui2=AeF_pdf0IaOlayl_ITimC30gdv1m2bFcuFh2_WbZsVy4WL1zmi87cnUlrRqRN7TxeKo&_nc_ohc=vdWuoZtilx8AX9HAm6z&_nc_ht=scontent-bog1-1.xx&oh=00_AfBUL7sAhLaAweMQEtDnWOYW_a03D2UIQQHuFgJ1hT9bzg&oe=63AF34BF"

export function Header(props){
    return(
        <div className="w-80 border-cv d-flex justify-content-center mt-2 p-3 text-light">
            <div className="w-80 position-relative d-flex flex-row align-items-center justify-content-around">
                <div className="image_profile position-absolute img_position">
                    <img src={my_image} class="image_profile_img d-block" alt="..."></img>
                </div>
                <div className="w-100">
                    <h1 className="fs-1 text-black m-0">Hector Fabio Pelaez Garcia</h1>
                    <h3 className="fs-6 text-sub">Fullstack Developer</h3>
                </div>
            </div>
        </div>
    )
}