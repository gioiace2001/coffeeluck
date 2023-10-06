import React from "react";
import LastestProduct from "../Layout/LastestProduct";
import ProductsByCategory from "../Layout/ProductsByCategory";
import BestSellingProduct from "../Layout/BestSellingProduct";
import Slideshow from "../Layout/Slideshow";

function Home() {
    return (
        <div>
            <Slideshow/>
            <LastestProduct/>
            <BestSellingProduct/>
            <ProductsByCategory/>
        </div>
    );
}

export default Home;
