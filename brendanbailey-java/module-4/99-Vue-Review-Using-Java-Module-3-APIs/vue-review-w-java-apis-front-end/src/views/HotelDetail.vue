<!-- Used when a hotel is clicked from the Home page            -->
<!-- cause the HotelDetail.vue component to be added to the DOM -->
<template>
    <div>
    <!--not a regular HTML tag kabob case -->
       <hotel-detail /> <!-- include the HotelDetail.vue component -->
    </div>
</template>
<script>
import HotelDetail from "@/components/HotelDetail"
export default {
    components: {
        HotelDetail
    }
}
</script>
<style scoped>

</style>