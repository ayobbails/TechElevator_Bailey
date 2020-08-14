<template>
    <div>
        <h2>Menu</h2>
        <section>
            <h3>Lunch</h3>
            <p>{{special1}}</p>
            <!-- img tag is how you specify an image - code path in src= attribute               -->
            <!-- the path specified for src= in this example is relative to project folder (site) -->
                <img src="../assets/full-stack-sandwich.png"/>
                <p>{{special2}}</p>
            <!-- img tag is how you specify an image - code path in src= attribute               -->
            <!-- the path specifed for src= in this example is relative to project folder (site) -->
                <img src="../assets/USBurger.png"/>
        </section>
    </div>
</template>

<script>
export default {
    data() {
        return {
            special1 : 'Front End Sandwich',
            special2 : 'Universal Serial Burger'
        }
    }
}
</script>

<style scoped>
img {
    height : 200px;
}
body {
    font-family : Arial, Helvetica, sans-serif;
}
h1 {
    font-size : 32px;
    color : cornflowerblue;
}
</style>