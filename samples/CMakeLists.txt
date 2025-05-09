cmake_minimum_required(VERSION 3.9)
project(gdx-c C)

set(CMAKE_C_STANDARD 17)
set(CMAKE_RUNTIME_OUTPUT_DIRECTORY ${CMAKE_SOURCE_DIR}/build/dist/)

if (NOT CMAKE_BUILD_TYPE)
    set(CMAKE_BUILD_TYPE Debug)
endif ()

set(CMAKE_C_FLAGS_DEBUG "${CMAKE_C_FLAGS_DEBUG} -g -std=c17")
set(CMAKE_C_FLAGS_RELEASE "${CMAKE_C_FLAGS_RELEASE} -O3 -std=c17")

if (WIN32)
    include_directories(
            ${CMAKE_SOURCE_DIR}/../external/glfw/include
            ${CMAKE_SOURCE_DIR}/../external/glew-2.1.0/include
            ${CMAKE_SOURCE_DIR}/../external/stb/include
    )
    link_directories(
            ${CMAKE_SOURCE_DIR}/../external/glfw/lib-vc2022
            ${CMAKE_SOURCE_DIR}/../external/glew-2.1.0/lib/Release/x64
    )
elseif (LINUX)
    find_package(PkgConfig REQUIRED)
    pkg_search_module(GLFW REQUIRED glfw3)
    pkg_search_module(GLEW REQUIRED glew)
    include_directories(
            ${GLFW_INCLUDE_DIRS}
            ${GLEW_INCLUDE_DIRS}
            ${CMAKE_SOURCE_DIR}/../external/stb/include
    )
elseif (MACOS OR DARWIN OR APPLE)
    include_directories(
            ${CMAKE_SOURCE_DIR}/../external/glfw-macos/include
            ${CMAKE_SOURCE_DIR}/../external/glew-macos/include
            ${CMAKE_SOURCE_DIR}/../external/stb/include
    )

    if (${CMAKE_SYSTEM_PROCESSOR} MATCHES "arm64")
        link_directories(
                ${CMAKE_SOURCE_DIR}/../external/glfw-macos/lib-arm64
                ${CMAKE_SOURCE_DIR}/../external/glew-macos/lib-arm64
        )
    else ()
        link_directories(
                ${CMAKE_SOURCE_DIR}/../external/glfw-macos/lib-x86_64
                ${CMAKE_SOURCE_DIR}/../external/glew-macos/lib-x86_64
        )
    endif ()
endif ()
add_definitions()
add_executable(gdx-c ${CMAKE_SOURCE_DIR}/../external/stb/include/stb_image.h build/generated/teavm/c/glew_include.c)

target_link_libraries(gdx-c glfw3 opengl32 glew32)

# Copy Asset
if (WIN32)
    file(COPY ${CMAKE_SOURCE_DIR}/build/generated/teavm/c/assets
            DESTINATION ${CMAKE_BINARY_DIR})
    file(COPY ${CMAKE_SOURCE_DIR}/../external/glfw/lib-vc2022/glfw3.dll
            DESTINATION ${CMAKE_SOURCE_DIR}/build/dist/Release)
    file(COPY ${CMAKE_SOURCE_DIR}/../external/glew-2.1.0/bin/Release/x64/glew32.dll
            DESTINATION ${CMAKE_SOURCE_DIR}/build/dist/Release)
    file(COPY ${CMAKE_SOURCE_DIR}/../external/glfw/lib-vc2022/glfw3.dll
            DESTINATION ${CMAKE_SOURCE_DIR}/build/dist/Debug)
    file(COPY ${CMAKE_SOURCE_DIR}/../external/glew-2.1.0/bin/Release/x64/glew32.dll
            DESTINATION ${CMAKE_SOURCE_DIR}/build/dist/Debug)
elseif (LINUX)
    file(COPY ${CMAKE_SOURCE_DIR}/build/generated/teavm/c/assets
            DESTINATION ${CMAKE_BINARY_DIR})
else ()
    file(COPY ${CMAKE_SOURCE_DIR}/build/generated/teavm/c/assets
            DESTINATION ${CMAKE_BINARY_DIR})
endif ()