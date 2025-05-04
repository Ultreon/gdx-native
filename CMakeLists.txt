cmake_minimum_required(VERSION 3.9)
project(gdx-c C)

set(CMAKE_C_STANDARD 17)
set(CMAKE_C_COMPILER gcc)
set(CMAKE_RUNTIME_OUTPUT_DIRECTORY ${CMAKE_SOURCE_DIR}/build/dist/)

if(NOT CMAKE_BUILD_TYPE)
    set(CMAKE_BUILD_TYPE Release)
endif()

set(CMAKE_C_FLAGS_DEBUG "${CMAKE_C_FLAGS_DEBUG} -g")
set(CMAKE_C_FLAGS_RELEASE "${CMAKE_C_FLAGS_RELEASE} -O3")

include_directories(${CMAKE_SOURCE_DIR}/external/glfw/include)
link_directories(${CMAKE_SOURCE_DIR}/external/glfw/lib-mingw/libglfw3.a)
add_definitions()
add_executable(gdx-c build/generated/teavm/c/all.c)

target_link_libraries(gdx-c ${CMAKE_SOURCE_DIR}/external/glfw/lib-vc2022/glfw3.lib opengl32)