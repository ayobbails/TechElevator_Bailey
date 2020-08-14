<!-- Managed by Vue Router                                                          -->
<!-- We have to tell the router it is managing this view                            -->
<!-- We need to update the index.js in the router folder to tell it about this view -->
<!-- Vue components are included here instead of App.vue                            -->

<template>
  <div>
    <div class="products">
      <h1>Products</h1>
      <products-review /> <!-- include the ProductsList.vue component in this page -->
    </div>
  </div>
</template>

<script>
import ProductsList from '@/components/ProductsList'; // access the ProductsList.vue component
export default {
    components: {
        ProductsList
    }
};
</script>

<style scoped>
</style>